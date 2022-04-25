package com.aopbasics.springaopbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aopbasics.springaopbasics.business.BusinessOne;
import com.aopbasics.springaopbasics.business.BusinessTwo;

@SpringBootApplication
public class SpringAopBasicsApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	BusinessOne b1;
	
	@Autowired
	BusinessTwo b2;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAopBasicsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(b1.calculateSome());
		logger.info(b2.calculateSome());
		
	}

}
