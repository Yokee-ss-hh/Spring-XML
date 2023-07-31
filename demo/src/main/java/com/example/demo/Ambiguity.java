package com.example.demo;

public class Ambiguity {
	
	public int a;
	
	public int b;
	
	public Ambiguity(int x, int y) {
		this.a = x;
		this.b = y;
		System.out.println("Integer data");
	}
	
	public Ambiguity(double x, double y) {
		this.a = (int)x;
		this.b = (int)y;
		System.out.println("Double data");
	}
	
	public Ambiguity(String x, String y) {
		this.a = Integer.parseInt(x);
		this.b = Integer.parseInt(y);
		System.out.println("String data");
	}
	
	// If there are multiple overloaded constructors in a class
	// XML file chooses the constructor which has String type as parameters by default as 
	// we are giving value parameter data as string in XML 
	
	// If there is no constructor with string data type as parameters
	// XML scans class from top to bottom and chooses the first constructor and uses it 
	
	// Imagine there is no String constructor above, XML chooses constructor with int type parameters
	// Imagine there is no string constructor above, double type constructor is above the int type constructor 
	// then XML chooses double type constructor as it is at the top
}
