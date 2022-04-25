package com.aopbasics.springaopbasics.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class AfterAOPAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// What kind of method I would intercept
	@AfterReturning(
			value="execution(* com.aopbasics.springaopbasics.business.*.*(..))",
			returning="result"
			)
	public void afterReturn(JoinPoint jp, Object result) {
		logger.info("{} returned the value {}",jp, result);
	}
	
	@AfterThrowing(
			value="execution(* com.aopbasics.springaopbasics.business.*.*(..))",
			throwing="result"
			)
	public void afterThrow(JoinPoint jp, Object result) {
		logger.info("{} returned the value {}",jp, result);
	}
	
	@After(
			value="execution(* com.aopbasics.springaopbasics.business.*.*(..))")
	public void afterThrow(JoinPoint jp) {
		logger.info("{} returned the value",jp);
	}
}
