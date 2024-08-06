package com.korea.restapi.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.korea.restapi.dto.LoginDTO;
import com.korea.restapi.dto.MemberDTO;
import com.korea.restapi.entity.Member;
import com.korea.restapi.repository.MemberRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class MemberServiceImpl implements MemberService{

	private final MemberRepository memberRepository;
	
	@Override
	public Member saveEntity(Member member) {
		return memberRepository.save(member);
	}
	
	@Override
	public Member saveDTO(MemberDTO memberDTO) {
		Member member = Member.builder()
										.userName(memberDTO.getUserName())
										.password(memberDTO.getPassword())
										.build();
		return saveEntity(member);
	}
	
	
	//로그인
	@Override
	public Member findBuUserName(String userName) {
		return memberRepository.findByUserName(userName);
	}
	
	@Override
	public boolean login(LoginDTO loginDTO) {
		String userName = loginDTO.getUserName();
		String password = loginDTO.getPassword();
		Member byUserName = memberRepository.findByUserName(userName);
		
		if(byUserName != null) {
			if( byUserName.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
		
}
