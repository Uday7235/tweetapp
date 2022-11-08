package com.learn.oop;

public class Sales extends Employee {
  Integer bonus=10000;
  Integer insentive;
  public static void main(String args[]) {
	  Sales ashish=new Sales();
	  ashish.insentive=2000;
	  ashish.totalSalary(ashish.basesalary, ashish.bonus, ashish.insentive);
  }
}
