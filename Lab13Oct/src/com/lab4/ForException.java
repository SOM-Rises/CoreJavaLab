/*
 Program 4. Create a cutom exception (Name cannot be null). 
 The user will enter student details , it will throw an exception if the name or id id null		 
 @Author: Somnath
 @Date: 13th Oct, 2022
 */

package com.lab4;

import java.util.Scanner;

public class ForException {

	// TODO Auto-generated method stub
	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// input all the details
		System.out.println("Enter the details of the student: ");
		System.out.println("Enter the student name: ");
		String name = sc.nextLine();
		System.out.println("Enter the student id: ");
		int id = sc.nextInt();

		if (id == 0 || name.isEmpty()) {
			throw new CustomException();
		} else {
			System.out.println("All details save ");

		}
		sc.close();
	}

}
