package com.lab1;

public class AddAmount {
	// creating instance variables
	private double initialAmount = 50;
	private double addAmount;
	private double finalAmount;

	// Default constructor
	public AddAmount() {

	}

	// Parameterized constructor
	public AddAmount(double addAmount) {

		finalAmount = initialAmount + addAmount;
	}

	public void displayAmount() {
		// TODO Auto-generated method stub
		System.out.println("Final Amount: " + finalAmount);
	}

	// getter and setter for initialAmount, addAmount and finalAmount

	public double getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}

	public double getAddAmount() {
		return addAmount;
	}

	public void setAddAmount(double addAmount) {
		this.addAmount = addAmount;
	}

	public double getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}

	@Override
	public String toString() {
		return "AddAmount [initialAmount=" + getInitialAmount() + ", addAmount=" + addAmount + "]";
	}

}