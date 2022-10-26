package com.StudentFeesManagement;

import java.util.HashMap;
import java.util.Scanner;

public class StudentCollectionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating a hashmap
		HashMap<String, StudentDetails> sDetails = new HashMap<String, StudentDetails>();

		String uniqueID;

		// creating scanner object
		Scanner sc = new Scanner(System.in);

		// creating StudentDetails object
		StudentDetails sInfo = new StudentDetails();

		// put details in the maps
		sDetails.put("1111", new StudentDetails(101, "Somnath Hazra", "JAVA", 1500, "FULLY PAID"));
		sDetails.put("2222", new StudentDetails(102, "Subham Haldar", "MERN Stack", 10000, "FULLY PAID"));
		sDetails.put("3333", new StudentDetails(103, "Snehasish Mondal", "PROGRAMMING IN C++", 1000, "FULLY PAID"));
		sDetails.put("4444", new StudentDetails(104, "Ayan Das", "AI IN PYTHON", 3000, "PARTIALLY  PAID"));
		sDetails.put("5555", new StudentDetails(105, "Soumya Maitra", "PROGRAMMING IN C", 1300, "FULLY PAID"));

		System.out.println();
		System.out.println("----STUDENT  FEES  MANAGEMENT------");
		System.out.println();

		System.out.println("Enter the student UNIQUE ID :");
		uniqueID = sc.next();

		// Student is present in the map or not
		boolean status = sDetails.containsKey(uniqueID);

		// displaying the information

		if (status) {
			System.out.println();
			System.out.println("----------------STUDENT  DETAILS AS PER DATABASE-------------");
			System.out.println();
			sInfo = sDetails.get(uniqueID);
			System.out.println(sInfo);

		}

		else {
			System.out.println();
			System.out.println("----------------STUDENT  DETAILS NOT FOUND IN DATABASE-------------");
			System.out.println();
		}

		sc.close();

	}

}
