package com.lab1;

import java.util.Scanner;

public class PiggyTest extends AddAmount {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to add: ");
		AddAmount a = new AddAmount(sc.nextDouble());
		a.displayAmount();

		char choice;
		while (true) {
			System.out.println("Do you want to add more?: ");
			choice = sc.next().toLowerCase().charAt(0);
			if (choice == 'y') {
				System.out.println("Enter the amount you want to add again: ");
				double money;
				money = sc.nextDouble();
				money += a.getFinalAmount();
				a.setFinalAmount(money);
				System.out.println(money);

			} else {
				break;
			}
		}

	}
}
