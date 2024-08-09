package com.korea.back.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {

	@NotBlank(message = "아이디를 입력하세요.")
	private Long id;
	
	@NotBlank(message = "닉네임을 입력하세요")
	@Size(min=2, message = "닉네임이 너무 짧습니다.")
	private String nickname;

	private int age;

	@NotBlank(message = "비밀번호를 입력하세요")
	private String password;

	private String checkedPassword;

	//private com.korea.back.entity.Member member;


	
}
