package com.oraclejava.mvc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.oraclejava.mvc.model.Bbs;
import com.oraclejava.mvc.model.BbsFile;

public interface BbsMapper {

	@Select("select * from bbs")
	List<Bbs> selectBbs();
	
//	@Insert("insert into bbs(BBSNO, TITLE, UPLOADER, CONTENT) \r\n" + 
//			"values (bbs_seq.nextval,#{title},#{uploader},#{content})")
	void insertBbs(Bbs bbs);
	
	@Insert("insert into BBSFILE(BBSFILENO, SAVEDFILENAME, USERFILENAME, bbsno) \r\n" + 
			"values (bbsfile_seq.nextval,#{savedfilename},#{userfilename},#{bbsno})")
	void insertBbsFile(BbsFile file);
	
	@Select("select * from bbs where bbsno=#{no}")
	Bbs selectBbsByBbsNo(int no);
	
	@Select("select * from bbsFile where BBSNO=#{bbsNo}")
	List<BbsFile> selectBbsFilesByBbsNo(int bbsNo);
	
	@Select("select * from BBSFILE where BBSFILENO=#{no}")
	BbsFile selectBbsFilesByFileNo(int no);
	
	@Update("update bbs set READCOUNT = READCOUNT+1 where BBSNO=#{bbsNo}")
	void updateReadCount(int bbsNo);
	
	@Update("update BBSFILE set DOWNLOADCOUNT = DOWNLOADCOUNT+1 where BBSFILENO=#{no}")
	void updateDownloadCount(int no);
	
}
