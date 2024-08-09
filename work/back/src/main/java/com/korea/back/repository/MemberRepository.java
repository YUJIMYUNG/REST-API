package com.korea.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korea.back.entity.Member;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	//Member Entity에서 찾을 userName
	//Member findByUserName(String userName);

	Optional<Member> findBuEmail(String email);
}
