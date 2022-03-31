package com.bridgelabz.day1;

public class DemoStatic {
	int a;// instance variable
	static int b = 50;// static variable

	// Static method
	static void add(int x, int y) {
		System.out.println("Static method");
		System.out.println("Addition =" + (x + y));
	}

	// Static block
	static {
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		// We can directly access static variable
		System.out.println("Static variable :" + b);

		// Calling static method
		add(10, 20);
	}
}
