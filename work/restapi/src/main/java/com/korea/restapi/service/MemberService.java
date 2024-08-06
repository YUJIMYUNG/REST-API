package com.korea.restapi.service;

import com.korea.restapi.dto.LoginDTO;
import com.korea.restapi.dto.MemberDTO;
import com.korea.restapi.entity.Member;

public interface MemberService {
	
	Member saveEntity(Member member);
	
	Member saveDTO(MemberDTO memberDTO);
	
	Member findBuUserName(String userName);
	
	boolean login(LoginDTO loginDTO);
	
}
