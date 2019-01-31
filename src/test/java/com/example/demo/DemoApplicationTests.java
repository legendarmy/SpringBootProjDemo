package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootApplication
@EnableAutoConfiguration
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplicationTests.class, args);
	}

}

