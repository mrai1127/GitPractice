package com.git.practice.rai;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scanner.nextLine();
		
		if(isPalindrome(word)){
			System.out.println(word + " is a palindorme.");
		}else {
			System.out.println(word + " is not a palindrome.");
		}
	}
	
	public static boolean isPalindrome(String word) {
		//Remove all non-letter characters and convert to lowercase
		word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		//Compare the word with its reverse
		String reverse = new StringBuilder(word).reverse().toString();
		return word.equals(reverse);
	}
	
	//Just checking with the commit
}
