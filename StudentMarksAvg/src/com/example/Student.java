package com.example;

// variable 
public class Student {
	private float Begali;
	private float English;
	private float Philosphy;
	private float Geography;
	private float Math;
	protected float avarageMarks;
	String name;

	// default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Student(float begali, float english, float philosphy, float geography, float math, float avarageMarks,
			String name) {
		super();
		this.Begali = begali;
		this.English = english;
		this.Philosphy = philosphy;
		this.Geography = geography;
		this.Math = math;
		this.avarageMarks = avarageMarks;
		this.name = name;
	}

	// getter setter

	public float getBegali() {
		return Begali;
	}

	public void setBegali(float begali) {
		Begali = begali;
	}

	public float getEnglish() {
		return English;
	}

	public void setEnglish(float english) {
		English = english;
	}

	public float getPhilosphy() {
		return Philosphy;
	}

	public void setPhilosphy(float philosphy) {
		Philosphy = philosphy;
	}

	public float getGeography() {
		return Geography;
	}

	public void setGeography(float geography) {
		Geography = geography;
	}

	public float getMath() {
		return Math;
	}

	public void setMath(float math) {
		Math = math;
	}

	public float getAvarageMarks() {
		return avarageMarks;
	}

	public void setAvarageMarks(float avarageMarks) {
		this.avarageMarks = avarageMarks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [ Begali=" + Begali + ", English=" + English + ", Philosphy=" + Philosphy + ", Geography="
				+ Geography + ", Math=" + Math + ", avarageMarks=" + avarageMarks + ", name=" + name + ", toString()="
				+ super.toString() + "]";
	}

}
