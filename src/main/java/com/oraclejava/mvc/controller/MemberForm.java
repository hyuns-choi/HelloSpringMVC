package com.oraclejava.mvc.controller;

import java.util.Date;

public class MemberForm {
	private String memberid;
	private String passwd;
	private String passwd2;
	private String email;
	private String usertype;
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getPasswd2() {
		return passwd2;
	}
	public void setPasswd2(String passwd2) {
		this.passwd2 = passwd2;
	}	
	@Override
	public String toString() {
		return "MemberForm [memberid=" + memberid + ", passwd=" + passwd + ", passwd2=" + passwd2 + ", email=" + email
				+ ", usertype=" + usertype + "]";
	}
	
}
