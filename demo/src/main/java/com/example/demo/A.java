package com.example.demo;

public class A {
	
	private String a;
	
	private B bObj;

	@Override
	public String toString() {
		return "A [a=" + a + ", bObj=" + bObj + "]";
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public B getbObj() {
		return bObj;
	}

	public void setbObj(B bObj) {
		this.bObj = bObj;
	}
}
