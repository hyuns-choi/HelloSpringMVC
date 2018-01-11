package com.oraclejava.mvc.controller;

import org.springframework.web.multipart.MultipartFile;

public class FileItem {
	
	private static final long serialVerisonUID = 1L;

	private int bbsfileno;
	
	private int downloadcount;
	

	private String savedfilename;
	
	private String userfilename;
	
	private MultipartFile file;
	public int getBbsfileno() {
		return bbsfileno;
	}
	
	public void setBbsfileno(int bbsfileno) {
		this.bbsfileno = bbsfileno;
	}


	public String getSavedfilename() {
		return savedfilename;
	}

	public void setSavedfilename(String savedfilename) {
		this.savedfilename = savedfilename;
	}

	public String getUserfilename() {
		return userfilename;
	}

	public void setUserfilename(String userfilename) {
		this.userfilename = userfilename;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public static long getSerialverisonuid() {
		return serialVerisonUID;
	}

	public int getDownloadcount() {
		return downloadcount;
	}

	public void setDownloadcount(int downloadcount) {
		this.downloadcount = downloadcount;
	}

	
	
}
