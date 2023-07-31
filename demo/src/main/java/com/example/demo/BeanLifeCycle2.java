package com.example.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle2 implements InitializingBean, DisposableBean{
	
	public String name;
	
	public BeanLifeCycle2() {
		super();
		System.out.println("Object is being initialized");
	}

	@Override
	public String toString() {
		return "BeanLifeCycle2 [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("The data name is injected to object");
		this.name = name;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("I am destroying now");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("I am starting right after data injected to object");
	}
}
