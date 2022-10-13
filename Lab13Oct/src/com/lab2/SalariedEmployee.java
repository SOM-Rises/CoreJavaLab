/*
 	Program : Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee
 	  		  and functionality. Create a test class.
 	@Author : Somnath Hazra
 	@Date :13 Oct  		  	
 */

package com.lab2;

public class SalariedEmployee extends Employee {

	// no arg constructor
	public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parametirized constructor
	public SalariedEmployee(int empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}

	// calculate salary
	public void calculateSalary(int numberOfMonth) {
		this.empSalary = numberOfMonth * 10000;
	}
}
