package com.spring.basics.springbasics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.classes.ReadProperties;

@Configuration
@ComponentScan("com.classes")
@PropertySource("classpath:application.properties")
public class SpringPropertyReader {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(
				SpringPropertyReader.class)) {
			ReadProperties rp = ac.getBean(ReadProperties.class);
			System.out.println(rp.getUrl());
		}
	}
}
