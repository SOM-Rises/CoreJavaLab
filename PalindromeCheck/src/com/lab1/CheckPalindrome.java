package com.lab1;

import java.util.Scanner;

public class CheckPalindrome {

	// method for checkpalindrome
	static boolean palindromeOrnot(String str) {

		boolean status;
		String reverse = "";

		// reverse the string input the empty string
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}

		// method for comparing
		int flag = str.compareTo(reverse);

		if (flag == 0) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("-----------Enter the string:-----------");
		String s = sc.next();

		boolean check = palindromeOrnot(s); // call the method

		if (check) {
			System.out.println("-----------This is palindrome-----------");
		} else {
			System.out.println("-----------This is not palindrome-----------");
		}

	}

}
