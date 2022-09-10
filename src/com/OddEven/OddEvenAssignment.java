package com.OddEven;

import java.util.Scanner;

public class OddEvenAssignment {

	public static void main(String[] args) {

		System.out.println("Welcom to Odd-Even Program");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
	}
}
