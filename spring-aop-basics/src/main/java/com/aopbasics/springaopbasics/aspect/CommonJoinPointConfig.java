package com.aopbasics.springaopbasics.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.aopbasics.springaopbasics.business.*.*(..))")
	public void businessPointCut() {}
	
	@Pointcut("@annotation(com.aopbasics.springaopbasics.aspect.TrackTime)")
	public void trackTimePointCut() {}
	
}
