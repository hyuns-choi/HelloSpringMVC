package com.oraclejava.mvc.service;

import com.oraclejava.mvc.model.Member;

public interface MemberService {
	void insertMember(Member member) throws Exception;
	Member selectMemberByIdAndPassword(String id, String pwd); 

}
