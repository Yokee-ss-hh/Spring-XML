package com.example.demo;

public class Employee {
	
	private String employeeName;
	
	private Address employeeAddress;

	public Employee(String employeeName, Address employeeAddress) {
		super();
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		System.out.println("Employee constructor is called");
	}
	
	public Employee() {}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeAddress=" + employeeAddress + "]";
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Address getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
}
