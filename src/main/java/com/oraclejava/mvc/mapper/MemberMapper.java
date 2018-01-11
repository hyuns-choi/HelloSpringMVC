package com.oraclejava.mvc.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.oraclejava.mvc.model.Member;

public interface MemberMapper {
	
	void insertMember(Member member);

	@Select("select * from members where "+
			"memberid=#{xxx} and passwd=#{passwd}")
	Member selectMemberByIdAndPassword(@Param(value="xxx") String id, @Param(value="passwd") String passwd);

}
