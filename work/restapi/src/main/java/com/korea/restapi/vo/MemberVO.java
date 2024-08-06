package com.korea.restapi.vo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import lombok.Data;

@Data
public class MemberVO {
	@Id
	private Long id;
	private String userName;
	private String password;
}
