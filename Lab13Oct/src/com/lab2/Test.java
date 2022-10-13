/*
 	Program : Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee
 	  		  and functionality. Create a test class.
 	@Author : Somnath Hazra
 	@Date :13 Oct  		  	
 */

package com.lab2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hourly Employee-------------");

		// HourlyEmployee
		HourlyEmployee emp1 = new HourlyEmployee();
		System.out.println("Enter Employee Name : ");
		emp1.setEmpName(sc.next());
		System.out.println("Enter Employee id : "); // enter all the details
		emp1.setEmpId(sc.nextInt());
		System.out.println("Enter The time duration in hour: ");
		emp1.calculateSalary(sc.nextInt());

		System.out.println("Employee Name : " + emp1.getEmpName()); // print the details
		System.out.println("Employee id : " + emp1.getEmpId());
		System.out.println("Employee Salary is a day: " + emp1.getEmpSalary());

		// SalariedEmployee
		System.out.println("Salaried Employee-------------");
		SalariedEmployee emp2 = new SalariedEmployee();
		System.out.println("Enter Employee Name : "); // enter all the details
		emp2.setEmpName(sc.next());
		System.out.println("Enter Employee id : ");
		emp2.setEmpId(sc.nextInt());
		System.out.println("Enter The month : ");
		emp2.calculateSalary(sc.nextInt());

		System.out.println("Employee Name : " + emp2.getEmpName());
		System.out.println("Employee id : " + emp2.getEmpId()); // print the details
		System.out.println("Employee Salary in a month: " + emp2.getEmpSalary());

	}

}
