package com.cen.sec.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cen.sec.config.AppConfig;
import com.cen.sec.domain.Member;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
public class memberDaoTest {

	@Autowired
	MemberMapper memberMapper;
	
	private final Logger logger = LoggerFactory.getLogger(memberDaoTest.class.getName());
		
	List<Member> members = new ArrayList<>();
	
	@Test
	public void test() {
		members = memberMapper.selectAllMember();
		for(Member member : members) {
			logger.info(member.toString());
		}
	}
	
	@Test
	@Disabled
	public void insertTest() {
		Member member = new Member();
		member.setUsername("draven11");
		member.setEmail("dd@naver.com");
		member.setName("hongk");
		member.setPassword("1234");
		
		memberMapper.insertMember(member);
	}

}
