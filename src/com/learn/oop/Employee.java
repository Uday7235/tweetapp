package com.learn.oop;

public class Employee {
	Integer basesalary=50000;
	void totalSalary(Integer bs,Integer bonus) {
		Integer total =bs+bonus;
		System.out.println(total);
	}
	void totalSalary(Integer bs,Integer bonus,Integer insentive) {
		Integer total =bs+bonus+insentive;
		System.out.println(total);
	}
	void working() {
		System.out.println("Employee is working");
	}
}
