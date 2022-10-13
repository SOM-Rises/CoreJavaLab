/*
 Program 3. Create a Account and perform synchronized withdrawal in it using Threads		 
 @Author: Somnath
 @Date: 13th Oct, 2022
 */

package com.lab3;

import java.util.Scanner;

public class AccountTest extends Thread {

	// create instance Account class
	Account a = new Account();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create instance AccountTest class
		AccountTest acc = new AccountTest();
		// creating two thread
		Thread t1 = new Thread(acc, "Somnath");
		Thread t2 = new Thread(acc, "somu");

		t1.start();
		t2.start();

	}

	// MakeWithDrawl method
	synchronized void MakeWithDrawl(int amt) {

		if (a.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to wihtdrawl amount: " + amt);
			try {
				Thread.sleep(500); // sleep thread for 500ms
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			a.withDrawl(amt); // pass amount to the withdrawl
			System.out.println(Thread.currentThread().getName() + " is wihtdrawl amount: " + amt);
			System.out.println("The amount is " + a.getBalance());
		} else {
			System.out.println(Thread.currentThread().getName() + " is not have enough money");
			System.out.println("The amount is " + a.getBalance());

		}
	}

	// run method
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		int am = sc.nextInt();
		MakeWithDrawl(am); // call MakeWithDrawl method
		if (a.getBalance() < 0) {
			System.out.println("this is overdrawn");

		}
	}
}
