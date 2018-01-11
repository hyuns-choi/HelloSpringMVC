package com.oraclejava.mvc.model;

public class BbsFile {
	
	private int bbsfileno;
	private String savedfilename;
	private String userfilename;
	private int downloadcount;
	private int bbsno;
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
	public int getDownloadcount() {
		return downloadcount;
	}
	public void setDownloadcount(int downloadcount) {
		this.downloadcount = downloadcount;
	}
	public int getBbsno() {
		return bbsno;
	}
	public void setBbsno(int bbsno) {
		this.bbsno = bbsno;
	}

}
