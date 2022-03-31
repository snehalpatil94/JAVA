package com.bridgelabz.day1;

public class StringEqual {

	public static void main(String[] args) {
		String str1 = new String("Problem 3");
		String str2 = new String("Problem 3");
		String str3 = new String("1, 2, 3, 4");

		// Checking is strings are equal
		if (str1.equals(str2)) {
			System.out.println("str1 is equal to str2  ");
		} else if (str1.equals(str3)) {
			System.out.println("str1 is equal to str3  ");
		} else
			System.out.println("str3 is not equal to str1 ");
	}
}
