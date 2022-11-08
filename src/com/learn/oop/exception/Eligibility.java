package com.learn.oop.exception;

public class Eligibility {
public static void eligible(Integer exp) {
	if(exp<10) {
		throw new ArithmeticException("this person is not eligible for system architect");
	}
	else {
		System.out.println("this person is eligible");
	}

}
public static void main(String[] args) {
	eligible(8);
}
}
