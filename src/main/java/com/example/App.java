package com.example;

public class App {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		System.out.println("Addition = " + calculator.add(10, 20));
		System.out.println("Multiplication = " + calculator.multiply(5, 4));
	}
}