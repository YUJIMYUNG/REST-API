package com.korea.restapi.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member {

	@jakarta.persistence.Id
	@GeneratedValue
	private Long id;
	
	
	private String userName;
	private String password;
}
