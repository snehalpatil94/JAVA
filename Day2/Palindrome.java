package com.bridgelabz.day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n, reversed = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n = s.nextInt();
		s.close();// close scanner

		int num = n;
		while (num != 0) {

			// get last digit from num
			int digit = num % 10;
			reversed = reversed * 10 + digit;

			// remove the last digit from num
			num = num / 10;
		}

		// check palindrome
		if (n == reversed) {
			System.out.println(+n + " is PALINDROME Number.");
		} else
			System.out.println(+n + " is NOT PALINDROME Number.");
	}
}
