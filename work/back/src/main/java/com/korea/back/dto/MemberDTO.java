package com.korea.back.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {
	private Long id;
	
	@NotBlank(message = "이름을 입력하세요")
	private String userName;
	
	@NotBlank(message = "비밀번호를 입력하세요")
	private String password;
	
}
