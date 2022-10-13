/*
 Program 3. Create a Account and perform synchronized withdrawal in it using Threads		 
 @Author: Somnath
 @Date: 13th Oct, 2022
 */

package com.lab3;

public class Account {

	private int balance = 1000;

	// getter of the balance
	public int getBalance() {
		return balance;
	}

	// method of the withDrawl
	public void withDrawl(int amount) {
		balance = balance - amount;
	}
}
