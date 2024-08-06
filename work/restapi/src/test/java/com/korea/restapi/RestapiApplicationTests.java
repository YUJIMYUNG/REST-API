package com.korea.restapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.korea.restapi.mapper.testMapper;

import lombok.RequiredArgsConstructor;

@SpringBootTest
class RestapiApplicationTests {
	@Autowired
	private testMapper testMapper;

	@Test
	void contextLoads() {
		
	}

}
