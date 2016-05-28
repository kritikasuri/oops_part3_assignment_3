package com.acadgild.assignment.overloading;

public class main {
  
	public static void main(String[] args) {
	area_overload obj1 = new area_overload(5);
	area_overload obj2 = new area_overload(4, 5);
	
	System.out.println("The area of square : "+obj1.area());
	System.out.println("The area of rectangle : "+obj2.area());
	
}
}
