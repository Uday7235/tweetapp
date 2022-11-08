package com.learn.oop;
 class Employees{
	 Integer basesalary=50000;
 }
public class Dev extends Employees{
     Integer bonus=25000;
     Integer total=bonus+basesalary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Dev ajay=new Dev();
      System.out.println("Total salary of Ajay is "+ajay.total);
	}

}
