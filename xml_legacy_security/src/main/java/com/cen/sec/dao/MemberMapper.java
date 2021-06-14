package com.cen.sec.dao;

import java.util.List;

import com.cen.sec.domain.Member;


public interface MemberMapper {
	public List<Member> selectAllMember();
	
	public void insertMember(Member member);
}
