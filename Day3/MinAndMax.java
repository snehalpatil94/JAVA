package com.bridgelabz.day3;

import java.util.Scanner;

public class MinAndMax {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the how many number you want to store: ");
		n = sc.nextInt();
		int[] array = new int[n]; // creating array
		System.out.println("Enter the elements of the array: ");

		// reading array elements from the user
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		// accessing array elements using the for loop
		System.out.println("Array elements are: ");

		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}

		// Smallest element of array
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Smallest element of Array : " + min);

		// Largest element of array
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("largest element of Array : " + max);

		// close scanner
		sc.close();
	}
}
