package com.git.practice.rai;

import java.util.Scanner;

public class AAInterview {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Prompt the user to enter the number of passengers
		System.out.println("Enter the number of passengers: ");
		int numPassengers = scanner.nextInt();
		
		//Prompt the user to enter the flight distance
		System.out.println("Enter the flight distance(in miles): ");
		int flightDistance = scanner.nextInt();
		
		//Calculate the total cost of the flight
		double baseFare = 200.0;
		double perPassengerFare = 50.0;
		double perMileFare = 0.1;
		
		double totalFare = baseFare + numPassengers * perPassengerFare + flightDistance * perMileFare;
		
		//Print the total fare to the user
		System.out.printf("The total fare is : $%.2f", totalFare);
	}

}
