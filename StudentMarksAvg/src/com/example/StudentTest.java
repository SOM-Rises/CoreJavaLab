package com.example;

import java.util.Scanner;

public class StudentTest {

	// method for Collage student
	static void calculateAvg(CollageStudents c) {

		float total = c.getBegali() + c.getEnglish() + c.getPhilosphy() + c.getGeography() + c.getMath();
		float avg = total / 5;
		c.setAvarageMarks(avg);
		System.out.println(c.getName() + " Avarage marks is : " + c.getAvarageMarks());
	}

	// method for School student
	static void calculateAvg(SchoolStudents s) {

		float total = s.getBegali() + s.getEnglish() + s.getGeography() + s.getMath();
		float avg = total / 4;
		s.setAvarageMarks(avg);
		System.out.println(s.getName() + " Avarage marks is : " + s.getAvarageMarks());
	}

	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner class
		Scanner sc = new Scanner(System.in);

		// class of CollageStudents
		CollageStudents c = new CollageStudents();

		System.out.println("enter the Collage Student marks : ");
		System.out.println();
		System.out.println("enter the Collage Student name : ");
		c.setName(sc.nextLine()); // input the name

		// Enter the subject marks
		System.out.println("enter the Bengali : ");
		c.setBegali(sc.nextFloat());
		System.out.println("enter the English : ");
		c.setEnglish(sc.nextFloat());
		System.out.println("enter the Philosophy: ");
		c.setPhilosphy(sc.nextFloat());
		System.out.println("enter the Geography : ");
		c.setGeography(sc.nextFloat());
		System.out.println("enter the Math : ");
		c.setMath(sc.nextFloat());
		calculateAvg(c);

		System.out.println();

		// class of SchoolStudents
		SchoolStudents s = new SchoolStudents();

		System.out.println("enter the School Student marks : ");
		System.out.println();
		System.out.println("enter the School Student name : ");
		s.setName(sc.next());// input the name

		// Enter the subject marks
		System.out.println("enter the Bengali : ");
		s.setBegali(sc.nextFloat());
		System.out.println("enter the English : ");
		s.setEnglish(sc.nextFloat());
		System.out.println("enter the Geography : ");
		s.setGeography(sc.nextFloat());
		System.out.println("enter the math : ");
		s.setMath(sc.nextFloat());
		calculateAvg(s);

	}

}
