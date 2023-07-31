package com.example.demo;

public class Qualifier1 {
	
	public String name;
	
	public String place;

	@Override
	public String toString() {
		return "Qualifier1 [name=" + name + ", place=" + place + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
}
