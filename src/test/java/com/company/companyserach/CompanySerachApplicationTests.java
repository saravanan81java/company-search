package com.company.companyserach;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompanySerachApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void sampleTest() {
		boolean flag = true;
		System.out.println("Test 1");
		assertTrue(flag);
	}
}
