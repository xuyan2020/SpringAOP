package com.xuyan.spring.aop;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopLogging {
	
	@Before("execution(public int com.xuyan.spring.aop.Calculater.add(int, int))")
	public void beforeMethod(JoinPoint joinPoint) {
		// 获取方法名字
		String methodName = joinPoint.getSignature().getName();  
		// 获取所有实参
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("Method " + methodName + "is calculte " + list.get(0) + " + " + list.get(1));
	}
}

