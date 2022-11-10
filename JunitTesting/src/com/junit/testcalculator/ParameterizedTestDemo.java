package com.junit.testcalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {
   
	@ParameterizedTest(name= "{index}-run with args ={0}")
    
	@ValueSource(ints= {1,3,5,7})
	public void valueSource(int args) {
		System.out.println(args);
	}
	
	enum Tv{
		Lg,samsung,sony;
	}
	
	//-------------EnumSource
	@ParameterizedTest
	@EnumSource(Tv.class)
  public void enumSourceTest(Tv tv) {
	System.out.println(tv);
	}
	
	private static String[] cars() {
		return new String[] {"maruti","honda","hyundai"};
	}
	
	//-------MethodSource
	@ParameterizedTest
	@MethodSource("cars")
	public void metodSourceTesting(String cars) {
		System.out.println(cars);
	}
	
	//--------------csv source--
	@ParameterizedTest
	@CsvSource({"ajay","shiva","harish"})
	public void csvSourcetest(String name) {
	
	System.out.println(name);
      }
}
