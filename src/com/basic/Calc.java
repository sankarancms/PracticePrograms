package com.basic;

import java.util.Scanner;

public class Calc {
	int a, b;

	public int add() {
		return a + b;
	}

	public int sub() {
		return a - b;
	}

	public int mul() {
		return a * b;
	}

	public void div() {
		try {
			int c = a / b;
			System.out.println("Div : " + c);
		} catch (ArithmeticException e) {
			System.out.println("Could not divisible by zero");
			// e.printStackTrace();

		}

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
		int inputA, inputB, choice;

		Calc obj = new Calc();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Choice");
		System.out.println("Press 1 for Add, 2 for Sub, 3 for Mul, 4 for Div");
		choice = input.nextInt();
		System.out.println("Enter the values");
		inputA = input.nextInt();
		inputB = input.nextInt();

		obj.setA(inputA);
		obj.setB(inputB);
		input.close();

		switch (choice) {
		case 1:
			System.out.println(obj.add());
			break;
		case 2:
			System.out.println(obj.sub());
			break;
		case 3:
			System.out.println(obj.mul());
			break;
		case 4:
			obj.div();
			break;
		default:
			System.out.println("Invalid Choice");

		}

	}

}
