package com.bridgelabz.day3;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {

		int primeNo[] = { 2, 3, 5, 7, 11 };
		for (int x = 0; x < primeNo.length; x++) {
			System.out.println("primeNo[" + x + "]" + "   " + primeNo[x]);
		}

		// taking input from user in array
		int length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an Array : ");
		length = sc.nextInt();
		String[] names = new String[length];

		// Taking Array element
		for (int i = 0; i < length; i++) {
			System.out.println("Enter student name  : ");
			names[i] = sc.next();
		}

		// Printing an Array
		System.out.println("Students in class are :");
		for (int i = 0; i < length; i++) {
			System.out.println(names[i]);
		}

		// close scanner
		sc.close();
	}
}
