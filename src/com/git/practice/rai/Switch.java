package com.git.practice.rai;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		System.out.println("Enter an operator (+, -, *, /): ");
		char operator = scanner.next().charAt(0);
		
		double result;
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("Error: Invalid operator!!");
			return;
		}
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}

}
