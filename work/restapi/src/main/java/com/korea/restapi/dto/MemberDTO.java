package com.korea.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberDTO {
	private Long id;
	
	
	private String userName;
	
	private String password;
	
}
