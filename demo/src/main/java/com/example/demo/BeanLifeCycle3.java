package com.example.demo;

import javax.annotation.PreDestroy;

import jakarta.annotation.PostConstruct;

public class BeanLifeCycle3 {
	// PostConstruct and PreDestroy is been a part of Java EE 
	// Java EE is deprecated in java 9 and removed in java 11
	// In order to use these annotations, we need to add below dependency
	/*
	 <!-- https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api -->
<dependency>
    <groupId>javax.annotation</groupId>
    <artifactId>javax.annotation-api</artifactId>
    <version>1.2</version>
</dependency>
	 */
	public String color;
	
	public BeanLifeCycle3() {
		super();
		System.out.println("object is being created");
	}

	@Override
	public String toString() {
		return "BeanLifeCycle3 [color=" + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		System.out.println("color is being set");
		this.color = color;
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("init called");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("destroy called");
	}
	
}
