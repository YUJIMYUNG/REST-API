package com.korea.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korea.restapi.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	//Member Entity에서 찾을 userName
	Member findByUserName(String userName);

}
