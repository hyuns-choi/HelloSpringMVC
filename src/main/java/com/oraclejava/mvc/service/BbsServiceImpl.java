package com.oraclejava.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oraclejava.mvc.controller.BbsForm;
import com.oraclejava.mvc.controller.FileItem;
import com.oraclejava.mvc.mapper.BbsMapper;
import com.oraclejava.mvc.model.Bbs;
import com.oraclejava.mvc.model.BbsFile;

@Service
public class BbsServiceImpl implements BbsServices {

	@Autowired
	private BbsMapper	bbsMapper;
	
	@Override
	public List<Bbs> selectBbs() {
		// TODO Auto-generated method stub
		return bbsMapper.selectBbs();
	}

	@Override
	public void writeBbs(BbsForm bbsForm) {
		Bbs bbs = new Bbs();
		
		bbs.setTitle(bbsForm.getTitle());
		bbs.setUploader(bbsForm.getUploader());
		bbs.setContent(bbsForm.getContent());
		bbs.setReadcount(0);
		
		bbsMapper.insertBbs(bbs);
		// bbsno 채워옴
		
		BbsFile bbsFile = null;
		for(FileItem file : bbsForm.getFileItems()) {
			//객체생성 후 사용한다.
			bbsFile = new BbsFile();	
			bbsFile.setSavedfilename(file.getSavedfilename());
			bbsFile.setUserfilename(file.getUserfilename());
			bbsFile.setBbsno(bbs.getBbsno());
			bbsFile.setDownloadcount(0);
			
			bbsMapper.insertBbsFile(bbsFile);
		}		
	}

	@Override
	public BbsForm detailBbs(int no) {
		// TODO Auto-generated method stub
		
		
		bbsMapper.updateReadCount(no);

		BbsForm form = new BbsForm(); 

		Bbs bbs = bbsMapper.selectBbsByBbsNo(no);
		
		form.setBbsno(bbs.getBbsno());
		form.setTitle(bbs.getTitle());
		form.setReadcount(bbs.getReadcount());
		form.setUploader(bbs.getUploader());
		form.setContent(bbs.getContent());
		form.setRegdate(bbs.getRegdate());
		
		List<BbsFile> files = bbsMapper.selectBbsFilesByBbsNo(bbs.getBbsno());
		for(BbsFile file : files) {
			FileItem item = new FileItem();
			
			item.setBbsfileno(file.getBbsno());
			item.setSavedfilename(file.getSavedfilename());
			item.setUserfilename(file.getUserfilename());
			item.setDownloadcount(file.getDownloadcount());
			form.getFileItems().add(item);
		}	
				
		return form;
	}

	@Override
	public BbsFile selectBbsFile(int no) {
		// TODO Auto-generated method stub
		return null;
	}

}
