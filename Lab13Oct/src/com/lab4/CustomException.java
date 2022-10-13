/*
 Program 4. Create a cutom exception (Name cannot be null). 
 The user will enter student details , it will throw an exception if the name or id id null		 
 @Author: Somnath
 @Date: 13th Oct, 2022
 */

package com.lab4;

public class CustomException extends Exception {

	private static final long serialVersionUID = 1L;

	public CustomException() {
		System.out.println("The fields is null");
	}
}
