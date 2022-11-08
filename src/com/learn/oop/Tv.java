package com.learn.oop;

public class Tv {
 String brand;
 String modelName;
 Integer screensize;
 Integer price;
 String color;
 String displaytype;
 
 void insertData(String b,String mn,Integer ss,Integer p,String c,String dt) {
	    brand=b;
	    modelName=mn;
	    screensize=ss;
	    price=p;
	    color=c;
	    displaytype=dt;
 }
 
 void display() {
	 System.out.println(brand+" "+modelName);
 }

 
 public static void main(String args[]) {
	 
	 Tv lgoled = new Tv();
	 
	 Tv samsung= new Tv();
	 lgoled.brand= "LG";
	 lgoled.modelName="4K Oled";
	 lgoled.screensize=75;
	 lgoled.price=100000;
	 lgoled.color="black";
	 lgoled.displaytype="oled";
	 //System.out.println(lgoled.brand+" "+lgoled.modelName);
	 
	 samsung.insertData("samsung"," 65' Frame TV", 65, 120000, "beige", "Led");
	 //System.out.println(samsung.brand+" "+samsung.modelName);
	 lgoled.display();
	 samsung.display();
	 
 }
}
