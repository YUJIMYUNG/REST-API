package com.korea.back.service;

import com.korea.back.dto.LoginDTO;
import com.korea.back.dto.MemberDTO;
import com.korea.back.dto.MemberSignInRequestDTO;
import com.korea.back.dto.MemberSignUpRequestDTO;
import com.korea.back.entity.Member;

public interface MemberService {
	
//	Member saveEntity(Member member);
//
//	Member saveDTO(MemberDTO memberDTO);
//
//	Member findBuUserName(String userName);
//
//	boolean login(LoginDTO loginDTO);


	public String signIn(MemberSignInRequestDTO requestDTO) throws Exception;

	public Long singUp(MemberSignUpRequestDTO requestDTO) throws Exception;
}
