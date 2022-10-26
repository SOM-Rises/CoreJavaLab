/*
 * Q2. Create  a HashMap to store the fees submitted by student .The key of the Map will be Student Id.
   Create a method to find a student using the ID."
   
 * @author : Somnath Hazra
 * @Date : 26 Oct
 * 
 */

package com.StudentFeesManagement;

public class StudentDetails {

	// properties
	private int Sid;
	private String Sname;
	private String courseName;
	private double fees;
	private String feesStatus;

	// no arg constructor
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public StudentDetails(int sid, String sname, String courseName, double fees, String feesStatus) {
		super();
		Sid = sid;
		Sname = sname;
		this.courseName = courseName;
		this.fees = fees;
		this.feesStatus = feesStatus;
	}

	// getter setter
	public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		Sid = sid;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getFeesStatus() {
		return feesStatus;
	}

	public void setFeesStatus(String feesStatus) {
		this.feesStatus = feesStatus;
	}

	@Override
	public String toString() {
		return "StudentDetails [Sid=" + Sid + ", Sname=" + Sname + ", courseName=" + courseName + ", fees=" + fees
				+ ", feesStatus=" + feesStatus + "]";
	}

}
