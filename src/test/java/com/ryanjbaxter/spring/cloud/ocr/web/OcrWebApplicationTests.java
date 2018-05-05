package com.ryanjbaxter.spring.cloud.ocr.web;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = OcrWebApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@WebAppConfiguration
public class OcrWebApplicationTests {

	@Test
	public void contextLoads() {
	}

}
