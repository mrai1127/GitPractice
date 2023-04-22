package com.git.practice.rai;

import java.util.Scanner;

public class GradeChecker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i <= 3; i++) {
			System.out.println("Enter your grade(0-100)");
			int grade = scanner.nextInt();

			if (grade >= 90) {
				System.out.println("You got an A!");
			} else if (grade >= 80) {
				System.out.println("You got a B!");
			} else if (grade >= 70) {
				System.out.println("You got a C!");
			} else if (grade >= 60) {
				System.out.println("You got a D!");
			} else {
				System.out.println("You got an F!");
			}
		}
	}

}
