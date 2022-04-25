package com.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.classes.Test;

@ComponentScan("com.classes")
@SpringBootApplication
public class SpringBootRunner {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootRunner.class, args);
		Test t = ac.getBean(Test.class);
		System.out.println(t);
		
	}

}
