package com.bridgelabz.day2;

import java.util.Scanner;

public class Vowelconsonant {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet : ");
		ch = sc.next().charAt(0);// store character input from the user
		sc.close();
		switch (ch) {
		case 'a':
			System.out.println(ch + " is a vowel");
			break;

		case 'e':
			System.out.println(ch + " is a vowel");
			break;

		case 'i':
			System.out.println(ch + " is a vowel");
			break;

		case 'o':
			System.out.println(ch + " is a vowel");
			break;

		case 'u':
			System.out.println(ch + " is a vowel");
			break;

		case 'A':
			System.out.println(ch + " is a vowel");
			break;

		case 'E':
			System.out.println(ch + " is a vowel");
			break;

		case 'I':
			System.out.println(ch + " is a vowel");
			break;

		case 'O':
			System.out.println(ch + " is a vowel");
			break;

		case 'U':
			System.out.println(ch + " is a vowel");
			break;

		default:
			System.out.println(ch + " is a consonant");
			break;
		}
	}
}