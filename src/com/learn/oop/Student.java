package com.learn.oop;

public class Student {
Integer id;
String name;
Address address;
void addStudent(Integer id, String name, Address address) {
	
	this.id = id;
	this.name = name;
	this.address = address;
}

void displayStudent() {
	System.out.println(name+" "+address.city+" "+address.country);
}
public static void main(String[] args) {
	Address johnAddress=new Address("bangalore","karnataka","india");
    Student john=new Student();
    john.addStudent(101,"John philips", johnAddress);
    john.displayStudent();
}
}
