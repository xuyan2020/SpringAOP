package com.xuyan.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Calculater cal = (Calculater) ctx.getBean("calculater");
		
		int result = cal.add(6, 9);
		System.out.println("The result is " + result);
	}
}
