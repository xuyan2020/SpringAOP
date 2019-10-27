package com.xuyan.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Calculater {
	public int add(int i , int j) {
		return i + j;
	}
	
	public int exc(int i , int j) {
		return i / j;
	}
	public int sub(int i , int j) {
		return i - j;
	}
	public int mul(int i , int j) {
		return i * j;
	}
}
