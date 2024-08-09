package com.korea.back.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member extends BaseTimeEntity{

	@Id
	@GeneratedValue
	private Long id;

	@Column(length = 45, unique = true)
	private String email;

	@Column(length = 45)
	private String nickname;

	@Column(length = 100)
	private String password;

	private int age;

	@Enumerated(EnumType.STRING)
	private Role role;

	public void addUserAuthority(){
		this.role = Role.USER;
	}

	public void encodePassword(PasswordEncoder passwordEncoder){
		this.password = passwordEncoder.encode(password);
	}
}
