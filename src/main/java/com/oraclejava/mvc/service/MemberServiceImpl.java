package com.oraclejava.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.oraclejava.mvc.mapper.MemberMapper;
import com.oraclejava.mvc.model.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Transactional(readOnly=false, rollbackFor=RuntimeException.class)
	@Override
	public void insertMember(Member member) throws Exception {
		memberMapper.insertMember(member);
		
		//강제로롤백
		int count = 1;
		if (count == 1) {
			throw new RuntimeException("롤백되었음");
		}
	}
}
