package com.bridgelabz.day1;

import java.util.Scanner;

public class DisplayMsg {

	public static void main(String[] args) {
		// Display message
		System.out.println("HELLO...... WELCOME TO JAVA WORLD");

		// Display string
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Your Name : ");
		str = sc.next();

		System.out.println("Hello....  " + str);
		sc.close();
	}
}
