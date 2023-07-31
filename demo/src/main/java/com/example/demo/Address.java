package com.example.demo;

public class Address {
	private String address;

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}

	public Address(String address) {
		super();
		this.address = address;
	}
	
	public Address() {}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
