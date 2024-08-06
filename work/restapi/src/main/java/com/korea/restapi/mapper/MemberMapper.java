package com.korea.restapi.mapper;

import java.lang.reflect.Member;

import org.apache.ibatis.annotations.Mapper;

import com.korea.restapi.vo.MemberVO;

@Mapper
public interface MemberMapper {
	
	//회원가입
	public void saveMember(Member member);
}
