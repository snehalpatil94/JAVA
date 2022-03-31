package com.bridgelabz.day3;

import java.util.Scanner;

public class Ascending {

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

		// display array elements using the for loop
		System.out.println("Array elements are: ");

		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}

		// Ascending order
		int temp;
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < n; b++) {
				if (array[a] < array[b]) {
					temp = array[a];
					array[a] = array[b];
					array[b] = temp;
				}
			}
		}

		System.out.println("Array in Ascending order : ");
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}

		// Second largest no in array
		System.out.println("Second largest No in array");
		System.out.println(array[n - 2]);

		// Second smallest no in array
		System.out.println("Second largest No in array");
		System.out.println(array[1]);

		// close scanner
		sc.close();
	}
}
