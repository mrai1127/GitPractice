package com.git.practice.rai;

import java.util.ArrayList;
import java.util.Scanner;

public class InputProgram {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> results = new ArrayList<>();
		for(int i = 0; i < 5 ; i++) {
		
		
		System.out.println("What is your name ?");
		String name = scanner.nextLine();
		
		System.out.println("Where are you from?");
		String location = scanner.nextLine();
		
		String result = "Name: " + name + " " + "Location: " + location;
		results.add(result);
		}
		
		//print the rsults outside the loop
		for(String result : results) {
		System.out.println(result);
		}
	}
	
	//this is a for a demo purpose of git learning

}
