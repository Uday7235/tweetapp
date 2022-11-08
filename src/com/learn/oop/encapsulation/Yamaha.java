package com.learn.oop.encapsulation;

public class Yamaha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Bike fz=new Bike();
     fz.setName("Yamaha fz");
     fz.setCc(150);
     fz.setColor("red");
     fz.setPrice(90000);
     System.out.println(fz.getName()+" "+fz.getCc());
	}

}
