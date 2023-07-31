package com.example.demo;

public class BeanLifeCycle1 {
	
	// Spring bean life cycle
	
	// Application started -> Empty object of class created by calling default constructor/ parameterized constructor
	// -> Spring injects data from Xml into objects -> Spring calls custom init method -> spring class other methods if needed 
	// -> spring calls custom destroy method 
	
	// public void init()
	// public void destroy() 
	
	// We can change names of above methods but method signature is mandatory 
	
	public double price;
	
	public BeanLifeCycle1() {
		super();
		System.out.println("object is initialized");
	}

	@Override
	public String toString() {
		return "BeanLifeCycle1 [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("data for the created object is set from xml file by spring");
	}
	
	public void init() {
		System.out.println("init method is called");
	}
	
	public void destroy() {
		System.out.println("destroy method is called");
	}
}
