package com.acadgild.assignment.overloading;

public class area_overload {
	
	int length;
	int breadth;
	
	public area_overload(int s) {
		length=breadth=s;
	}
	
     public area_overload(int l, int b) {
		length=l;
		breadth=b;
	}
     
    public int area(){
    	return (length*breadth);
    }
    
}
