package com.bridgelabz.day2;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("a = ");
		a = sc.nextInt();
		System.out.println("b = ");
		b = sc.nextInt();
		System.out.println("c = ");
		c = sc.nextInt();
		sc.close();// close scanner

		double root_1, root_2;

		// calculate the determinant (b2 - 4ac)
		double determinant = b * b - 4 * a * c;
		System.out.println("Determinant :" + determinant);

		// check if determinant is greater than 0 then two real and different roots
		if (determinant > 0) {

			root_1 = (-b + Math.sqrt(determinant)) / (2 * a);
			root_2 = (-b - Math.sqrt(determinant)) / (2 * a);

			System.out.format("Root 1 =" + root_1 + "   " + "Root 2 =" + root_2);
		}

		// check if determinant is equal to 0
		else if (determinant == 0) {

			// determinant is equal to 0 .. two real and equal roots
			root_1 = root_2 = -b / (2 * a);
			System.out.println("Root 1 = " + root_1 + "   " + "Root 2 = " + root_2);
		} else // determinant < 0 ..roots are complex no
			System.out.println("Roots are complex no");
	}
}