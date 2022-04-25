package com.springbootbasics.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		
		// Get all beans
		for (String name : ac.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
