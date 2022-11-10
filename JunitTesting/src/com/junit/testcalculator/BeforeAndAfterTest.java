package com.junit.testcalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.test.Calculator;

class BeforeAndAfterTest {
	Calculator calc;
   @BeforeEach
   public void init() {
	   calc = new Calculator();
	   System.out.println("the before each method is calling");
   }
   
   @AfterEach
   public void afterEach() {
	   
	   System.out.println("the after each method is calling");
   }
   
   
	@Test
	@DisplayName("adding two numbers")
	public void testAddMethod() {
		
		int sum=calc.add(100, 100);
		assertEquals(200,sum);
		System.out.println("sum is " +sum);
	}
	
	@Test
	@DisplayName("subtracting two numbers")
	public void testSubMethod() {
		
		int total=calc.sub(100, 90);
		assertEquals(10,total);
		System.out.println("diff is " +total);
	}
	
	@Test
	@DisplayName("multiplying two numbers")
	public void testMultiplyMethod() {
		
		int multiply= calc.multiply(100,10);
		assertEquals(1000,multiply);
		System.out.println("product is " +multiply);
	}

}
