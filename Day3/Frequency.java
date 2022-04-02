package com.bridgelabz.Day3;

/**
 * Day 3 Problem 2 :Java Program to find the frequency of each element in the
 * array
 * 
 * @author Snehal Patil
 *
 */
public class Frequency {

	public static void main(String[] args) {
		int[] array = { 0, 8, 5, 7, 5, 5, 8, 10, 10 };
		int n = array.length;

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

		System.out.println("----------------------------");

		// Passing the sorted array
		System.out.println("Frequency of elements :");
		for (int i = 0; i < n; i++) {
			int count = 1;

			// checking your element duplication
			while (i < n - 1 && array[i] == array[i + 1]) {
				i++;
				count++;
			}
			System.out.println(array[i] + "  : " + count);
		}
	}
}
