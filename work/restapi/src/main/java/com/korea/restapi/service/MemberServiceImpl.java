package com.korea.restapi.service;

import java.lang.reflect.Member;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.korea.restapi.dao.MemberDAO;
import com.korea.restapi.dto.MemberDTO;
import com.korea.restapi.vo.MemberVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class MemberServiceImpl implements MemberService{
	private final MemberDAO memberDAO;
	
	@Override
	public Member saveVO(Member member) {
		return null;
	}
	
	@Override
	public Member saveDTO(MemberDTO memberDTO) {
		return null;
	}

}
