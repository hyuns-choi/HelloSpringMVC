package com.oraclejava.mvc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class BbsForm implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int bbsno;
	
	private String title;
	
	private String uploader;
	
	private String content;
	
	private int readcount;
	
	private Date regdate;
	
	public Date getRegdate() {
		return regdate;
	}


	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


	private List<FileItem> fileItems;
	
	private CommonsMultipartFile[] files;
	
	public BbsForm() {
		super();
		
		this.fileItems = new ArrayList<FileItem>();
	}
	

	public int getBbsno() {
		return bbsno;
	}

	public void setBbsno(int bbsno) {
		this.bbsno = bbsno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUploader() {
		return uploader;
	}

	public void setUploader(String uploader) {
		this.uploader = uploader;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public List<FileItem> getFileItems() {
		return fileItems;
	}

	public void setFileItems(List<FileItem> fileItems) {
		this.fileItems = fileItems;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public CommonsMultipartFile[] getFiles() {
		return files;
	}


	public void setFiles(CommonsMultipartFile[] files) {
		this.files = files;
	}
	
	
	
}
