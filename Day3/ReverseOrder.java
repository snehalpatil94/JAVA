package com.bridgelabz.day3;

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the how many number you want to store: ");
		n = sc.nextInt();
		int[] array = new int[n]; // creating array
		System.out.println("Enter the elements of the array: ");

		// Reading array elements from the user
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		// Displaying array elements using the for loop
		System.out.println("Array elements are: ");

		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}

		// Reverse Array
		System.out.println("Reverse array : ");
		for (int j = (n - 1); j >= 0; j--) {
			System.out.println(array[j]);
		}

		// Reverse Array by swapping method
		System.out.println("Reverse array : ");
		int temp;
		int first = 0;
		int last = n - 1;

		while (first < last) {
			temp = array[first];
			array[first] = array[last];
			array[last] = temp;

			first++;
			last--;
		}

		for (int l = 0; l < n; l++) {
			System.out.println(array[l]);
		}

		// close scanner
		sc.close();
	}
}
