package com.bridgelabz.day2;

import java.util.Scanner;

public class ForReversed {

	public static void main(String[] args) {
		int num, reversed = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		sc.close();// close scanner

		// Reverse no using for loop
		for (; num != 0; num = num / 10) {
			int remainder = num % 10;
			reversed = reversed * 10 + remainder;
		}

		System.out.println("Reversed Number: " + reversed);
	}
}
