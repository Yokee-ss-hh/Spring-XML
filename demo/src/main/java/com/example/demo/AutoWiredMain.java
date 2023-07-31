package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class AutoWiredMain {
	
	@Autowired
	public AutoWired1 wired1;
	public AutoWired2 wired2;
	public AutoWired3 wired3;
	
	@Autowired
	public AutoWiredMain(AutoWired1 wired1, AutoWired2 wired2, AutoWired3 wired3) {
		super();
		this.wired1 = wired1;
		this.wired2 = wired2;
		this.wired3 = wired3;
	}
	
	public AutoWiredMain() {}
	
	@Override
	public String toString() {
		return "AutoWiredMain [wired1=" + wired1 + ", wired2=" + wired2 + ", wired3=" + wired3 + "]";
	}
	public AutoWired1 getWired1() {
		return wired1;
	}
	public void setWired1(AutoWired1 wired1) {
		this.wired1 = wired1;
	}
	public AutoWired2 getWired2() {
		return wired2;
	}
	
	@Autowired
	public void setWired2(AutoWired2 wired2) {
		this.wired2 = wired2;
	}
	public AutoWired3 getWired3() {
		return wired3;
	}
	public void setWired3(AutoWired3 wired3) {
		this.wired3 = wired3;
	}
}
