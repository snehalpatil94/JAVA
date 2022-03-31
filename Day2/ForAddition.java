package com.bridgelabz.day2;

import java.util.Scanner;

public class ForAddition {
	// Method to add N natural no
	public int add(int x) {
		int add = 0;
		int n = x;
		for (int i = 1; i <= n; i++) {
			add = add + i;
		}
		return add;
	}

	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nth natural no : ");
		N = sc.nextInt();

		// Calling add function
		ForAddition test = new ForAddition();
		test.add(N);
		System.out.println("Addition of " + N + " Natural numbers : " + test.add(N));

		// close scanner
		sc.close();
	}
}
