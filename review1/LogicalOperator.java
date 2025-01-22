package com.neotech.review1;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter your age?");

		int age = input.nextInt();
		if (age == 0) {
			System.out.println("you are a newborn");
		} else if (age >= 1 && age <= 3) {
			System.out.println("you are a baby");
		}
		// using AND is better for a range
		else if (age == 4 || age == 5) {
			System.out.println("you are a toddler");
		}
		// using OR is better for individual value
		else if (age >= 6 && age <= 12) {
			System.out.println("you are a kid");
		} else if (age >= 13 && age <= 19) {
			System.out.println("you area a teenager");
		} else if (age >= 20) {
			System.out.println("you are an adult");
		} else {
			System.out.println("you are an alien");
		}

	}

}
