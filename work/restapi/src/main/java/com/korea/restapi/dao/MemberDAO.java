package com.korea.restapi.dao;

import java.lang.reflect.Member;

import org.springframework.stereotype.Repository;

import com.korea.restapi.mapper.MemberMapper;
import com.korea.restapi.vo.MemberVO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberDAO {
	private final MemberMapper memberMapper;
	
	//회원가입
	public void save(Member member) {
		memberMapper.saveMember(member);
	}

}
