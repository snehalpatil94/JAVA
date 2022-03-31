package com.bridgelabz.day2;

import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the date  : ");
		a = s.nextInt();
		System.out.println("Enter the month number : ");
		b = s.nextInt();

		// Checking Spring season
		if ((b == 3) && (a > 20)) {
			System.out.println("TRUE");
		} else if ((b == 4) && (a <= 30)) {
			System.out.println("TRUE");
		} else if ((b == 5) && (a <= 31)) {
			System.out.println("TRUE");
		} else if ((b == 6) && (a <= 20)) {
			System.out.println("TRUE");
		} else
			System.out.println("FALSE");

		// close scanner
		s.close();
	}
}
