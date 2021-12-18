package com.demo.springcore;

public class Employee {

	private int empId;
	
	private String employeeName; 
	
	public int getId() {
		return empId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
}