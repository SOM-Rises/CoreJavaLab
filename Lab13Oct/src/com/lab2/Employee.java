
/*
 	Program : Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee
 	  		  and functionality. Create a test class.
 	@Author : Somnath Hazra
 	@Date :13 Oct  		  	
 */

package com.lab2;

public class Employee {

	// instance variable
	private int empId;
	private String empName;
	protected int empSalary;

	// no arg constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parametirized constructor
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	// getter setter
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	// calculate salary
	public void calculateSalary(int timeOfwork) {
		this.empSalary = 0;
	}

}
