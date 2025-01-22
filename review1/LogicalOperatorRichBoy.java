package com.neotech.review1;

import java.util.Scanner;

public class LogicalOperatorRichBoy {

	// If you are a boy
	// If you are rich -- Buy a Ferrari
	// otherwise -- Play soccer

	// If you are a girl
	// If you are rich -- Buy a LV bag
	// otherwise -- Read a book
	// If you are none
	// Invalid gender
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your gender: m/f");

		char gender = scan.next().charAt(0);

		System.out.println("Are you rich?(true/false)");
		boolean rich = scan.nextBoolean();

		if (gender == 'm' && rich) // rich boy
		{
			System.out.println("buy a ferrari");
		} else if (gender == 'm' && !rich)// poor boy
		{
			System.out.println("play soccer");
		} else if (gender == 'f' && rich) // rich girl
		{
			System.out.println("buy vouiton bag");
		} else if (gender == 'f' && !rich) // poor girl
		{
			System.out.println("read a book");
		} else {
			System.out.println("invalid gender");
		}

	}

}
