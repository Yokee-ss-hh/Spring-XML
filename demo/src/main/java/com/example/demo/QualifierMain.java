package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class QualifierMain {
	
	@Autowired
	@Qualifier("quali2")
	public Qualifier1 q1;
	
	public QualifierMain() {}

	@Override
	public String toString() {
		return "QualifierMain [q1=" + q1 + "]";
	}

	public Qualifier1 getQ1() {
		return q1;
	}

	public void setQ1(Qualifier1 q1) {
		this.q1 = q1;
	}
}
