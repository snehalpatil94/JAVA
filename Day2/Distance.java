package com.bridgelabz.day2;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		int x, y;
		double distance;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x point");
		x = sc.nextInt();
		System.out.println("enter y point");
		y = sc.nextInt();
		sc.close();// close scanner

		// Calculate Euclidean distance
		distance = Math.sqrt((x * x) + (y * y));

		System.out.println("Euclidean distance from the point (x, y) to the origin (0, 0)" + distance);
	}
}
