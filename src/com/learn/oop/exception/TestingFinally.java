package com.learn.oop.exception;

public class TestingFinally {
public static void main(String[] args) {
	try {
		System.out.println("inside try block");
		Integer num=100/0;
		System.out.println(num);
		
	}catch(NullPointerException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("this bit is executing regardles  of exception occuring or not");
	}
	System.out.println("continue...");
}
}
