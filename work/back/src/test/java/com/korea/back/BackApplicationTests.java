package com.korea.back;

import com.korea.back.mapper.testMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackApplicationTests {
	@Autowired
	private testMapper testMapper;

	@Test
	void contextLoads() {
		
	}

}
