package com.oraclejava.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oraclejava.mvc.mapper.MemberMapper;
import com.oraclejava.mvc.model.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Transactional
	@Override
	public void insertMember(Member member) {
		memberMapper.insertMember(member);
	}
}
