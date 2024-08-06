package com.korea.restapi.service;

import java.lang.reflect.Member;

import com.korea.restapi.dto.MemberDTO;
import com.korea.restapi.vo.MemberVO;

public interface MemberService {
	Member saveVO(Member member);
	Member saveDTO(MemberDTO memberDTO);
}
