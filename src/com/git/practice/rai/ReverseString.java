package com.git.practice.rai;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//read input string form user
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();
		
		//revese the string using StringBuiler
		StringBuilder reversed = new StringBuilder(input).reverse();
		
		//pring the reversed string
		System.out.println("Reversed string: " + reversed);
	}

}
