package com.lab4;

public class Area extends Shape {

	double Area = 0; // Initializing the default value as 0
	float side; // declare the side
	float radius;// declare the radius

	@Override
	void RectangleArea(float length, float breadth) {
		// TODO Auto-generated method stub
		Area = length * breadth;
		System.out.println(" " + Area);
	}

	@Override
	void SquareArea(float side) {
		// TODO Auto-generated method stub
		Area = Math.pow(side, 2);
		System.out.println(" " + Area);

	}

	@Override
	void CircleArea(float radius) {
		// TODO Auto-generated method stub

		double pi = 3.1416;
		Area = pi * Math.pow(radius, 2);
		System.out.println(" " + Area);
	}

}
