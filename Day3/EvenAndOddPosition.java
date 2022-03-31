package com.bridgelabz.day3;

import java.util.Scanner;

public class EvenAndOddPosition {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the how many number you want to store: ");
		n = sc.nextInt();
		int[] array = new int[n]; // creating array
		System.out.println("Enter the elements of the array: ");

		// Taking array elements from the user
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		// Display array elements using the for loop
		System.out.println("Array elements are: ");

		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}

		// to print even position array
		System.out.println("Array elements that on even position are : ");
		for (int j = 0; j < n; j++) {
			if (j % 2 != 0) {
				System.out.println(array[j]);
			}
		}

		// to print odd position array
		System.out.println("Array elements that on odd position are : ");
		for (int j = 0; j < n; j++) {
			if (j % 2 == 0) {
				System.out.println(array[j]);
			}
		}
		
		// close scanner
		sc.close();
	}
}
