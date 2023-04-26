package com.jenkins.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	public static Logger logger= LoggerFactory.getLogger(DemoApplication.class);
	@Test
	void contextLoads() {
		logger.info("Testcase executing ....");
		assertEquals(true,true);
	}
	@Test
	@DisplayName("Test 1+1=2 ")
	void testAddition()
	{
		logger.info("Testcase executing ....");
		logger.info("Application executed ....");
		assertEquals(2,1+1);
	}


}
