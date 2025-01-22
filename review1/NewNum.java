package com.neotech.review1;

import java.util.Scanner;

public class NewNum {
	// ask until 2:36
	// Ask the user to enter 2 numbers
	// Ask the user for the operator (+,-,*,/)
	// Calculate the result using if-else
	public static void main(String[] args) {

		Scanner secil = new Scanner(System.in);

		System.out.println("please enter the first num");

		double d1 = secil.nextDouble();

		System.out.println("please enter the second num");
		double d2 = secil.nextDouble();

		System.out.println("please enter the oprator(+,-,*,/)");
		String operator = secil.next();

		System.out.println(d1 + " " + d2 + " " + operator);

		if (operator.equals("+")) {
			System.out.println("The result is " + (d1 + d2));
		}

		else if (operator.equals("-")) {
			System.out.println("The result is" + (d1 - d2));
		}

		else if (operator.equals("*")) {
			System.out.println("The result is" + (d1 * d2));
		} else if (operator.equals("/")) {
			System.out.println("The result is" + (d1 / d2));
		} else {
			System.out.println("invalid operator4");
		}

	}

}
