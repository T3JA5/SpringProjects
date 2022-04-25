package com.aopbasics.springaopbasics.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class UserAccessAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// What kind of method I would intercept
	@Before("execution(* com.aopbasics.springaopbasics.business.*.*(..))")
	public void before(JoinPoint jp) {
		logger.info("Check for access");
		logger.info("Allowed access for - {}",jp);
	}
	
}
