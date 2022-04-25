package com.aopbasics.springaopbasics.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// What kind of method I would intercept
	//@Around("execution(* com.aopbasics.springaopbasics.business.*.*(..))")
	//@Around("com.aopbasics.springaopbasics.aspect.CommonJoinPointConfig.businessPointCut()")
	@Around("com.aopbasics.springaopbasics.aspect.CommonJoinPointConfig.trackTimePointCut()")
	public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		long startTime = System.currentTimeMillis();
		pjp.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time taken by {} is {}",pjp,timeTaken);
	}
	
}
