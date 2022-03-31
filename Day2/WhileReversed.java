package com.bridgelabz.day2;

import java.util.Scanner;

public class WhileReversed {

	public static void main(String[] args) {
		int num, reversed = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();

		// run loop until number becomes 0
		while (num != 0) {

			int digit = num % 10; // get last digit from number
			reversed = reversed * 10 + digit;
			num /= 10; // remove the last digit from number
		}
		System.out.println("Reversed Number: " + reversed);
		
		// close scanner
		sc.close();
	}
}
