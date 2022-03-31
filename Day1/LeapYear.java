package com.bridgelabz.day1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter the year :");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();

		// Checking year is leap year
		if (((year >= 1582)) && ((year <= 9999))) {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				System.out.println(year + "is a Leap Year.");
			} else
				System.out.println(year + " is Not a Leap year.");
		} else
			System.out.println("Enter Valid Year.");
		sc.close();
	}
}
