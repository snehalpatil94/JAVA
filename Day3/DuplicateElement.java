package com.bridgelabz.day3;

import java.util.Scanner;

public class DuplicateElement {

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

		// Duplicate element
		System.out.println("Duplicate Element in array :");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					System.out.println(array[j]);
			}
		}
		sc.close();
	}
}
