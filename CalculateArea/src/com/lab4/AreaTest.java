package com.lab4;

import java.util.Scanner;

public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Area a = new Area();

		System.out.println("Enter the Rectangle lenght and breadth : ");
		a.RectangleArea(sc.nextFloat(), sc.nextFloat());

		System.out.println("Enter the Square side : ");
		a.SquareArea(sc.nextFloat());

		System.out.println("Enter the Circle radius : ");
		a.CircleArea(sc.nextFloat());

//		a.RectangleArea(10f, 5f);
//
//		a.SquareArea(9f);
//
//		a.CircleArea(7f);
	}

}
