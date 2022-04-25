package com.spring.basics.springbasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.classes.Test;

@Configuration
@ComponentScan("com.classes")
public class SpringWithoutBootRunner {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringWithoutBootRunner.class);
		Test t = ac.getBean(Test.class);
		System.out.println(t);
	}
	
}
