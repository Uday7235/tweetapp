package com.learn.oop.abstraction;

public class AjayTech implements ItCompanies {

	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println("Ajay is working on java project");
	}
  public static void main(String[] args) {
	AjayTech ajay=new AjayTech();
	ajay.working();
}
}
