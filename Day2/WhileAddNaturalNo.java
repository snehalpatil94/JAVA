package com.bridgelabz.day2;

import java.util.Scanner;

public class WhileAddNaturalNo {

	public static void main(String[] args) {
		int limit;
		System.out.println("Enter the Nth Natural no : ");
		Scanner sc = new Scanner(System.in);
		limit = sc.nextInt();
		sc.close();

		// Addition of N natural no
		int add = 0, n;
		n = limit;
		int i = 1;
		while (i <= n) {
			add = add + i;
			i++;
		}
		System.out.println("Addition of " + limit + " Natural numbers : " + add);
	}
}
