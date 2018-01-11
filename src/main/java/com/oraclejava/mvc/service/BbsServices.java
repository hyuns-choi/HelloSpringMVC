package com.oraclejava.mvc.service;

import java.util.List;

import com.oraclejava.mvc.controller.BbsForm;
import com.oraclejava.mvc.model.Bbs;
import com.oraclejava.mvc.model.BbsFile;

public interface BbsServices {
	List<Bbs> selectBbs();

	void writeBbs(BbsForm bbsForm);
	
	BbsForm detailBbs(int no);
	
	BbsFile selectBbsFile(int no);
	
	
}
