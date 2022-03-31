package com.bridgelabz.day2;

import java.util.Scanner;

public class IfElseUnit {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the no : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();// close scanner

		if ((n == 1)) {
			System.out.println("UNIT");
		} else if ((n == 10)) {
			System.out.println("TEN");
		} else if ((n == 100)) {
			System.out.println("HUNDRED");
		} else if ((n == 1000)) {
			System.out.println("THOUSAND");
		} else
			System.out.println("Enter Valid No");
	}
}
