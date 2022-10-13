/*
 	Program : Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee
 	  		  and functionality. Create a test class.
 	@Author : Somnath Hazra
 	@Date :13 Oct  		  	
 */

package com.lab2;

public class HourlyEmployee extends Employee {

	// no arg constructor
	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parametirized constructor
	public HourlyEmployee(int empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}

	// calculate salary
	public void calculateSalary(int timeOfwork) {
		this.empSalary = timeOfwork * 1000;
	}
}
