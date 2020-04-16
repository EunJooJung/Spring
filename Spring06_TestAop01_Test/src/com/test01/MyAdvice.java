package com.test01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAdvice {
	
	public MyAdvice() {
		
	}
	
	@Before("exeution(public * *(..))")
	public void beforeSaying(JoinPoint join) {
		System.out.println("당신의 이름은 무엇입니까?");
	}
	
	@AfterReturning(pointcut="exeution(public * *(..))", returning="returnVal")
	public void afterSaying(Object returnVal) {
		System.out.println(returnVal);
	}
	
	public void afterReturnSaying(JoinPoint join) {
		System.out.println("직업이 무엇입니까?");
		
	}

}
