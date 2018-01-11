package com.oraclejava.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.oraclejava.mvc.mapper.MemberMapper;
import com.oraclejava.mvc.model.Member;

@Service("memberServiceImpl")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	// 트랜젝션 선언 사용
	@Autowired
	private PlatformTransactionManager	transactionManager;
	
	
	//@Transactional(readOnly=false, rollbackFor=RuntimeException.class)
	@Override
	public void insertMember(Member member) throws Exception {
		
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		
		try {
		
			memberMapper.insertMember(member);
			
			//강제로롤백
			int count = 1;
			if (count == 1) {
//				throw new RuntimeException("롤백되었음");
			}
			
			transactionManager.commit(status);
		}catch (Exception e) {
			System.out.println("회원 추가시 에러발생. 롤백됩니다.");
			transactionManager.rollback(status);
			throw e;
		}		
	}


	@Override
	public Member selectMemberByIdAndPassword(String id, String pwd) {
		// TODO Auto-generated method stub

		return memberMapper.selectMemberByIdAndPassword(id, pwd);
	}
}
