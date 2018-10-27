package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@EnableAutoConfiguration
//@ComponentScan("com.springboot")
@SpringBootApplication(scanBasePackages={"com.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootStandAloneApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStandAloneApp.class, args);
	}
}
