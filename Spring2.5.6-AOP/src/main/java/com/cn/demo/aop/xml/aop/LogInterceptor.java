package com.cn.demo.aop.xml.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogInterceptor {
	
	public void before() {
		System.out.println("method start...");
	}
	
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("method around start...");
		pjp.proceed();
		System.out.println("method around end...");
	}
	
}
