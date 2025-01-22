package com.neotech.review1;

import java.util.Scanner;

public class ScanerReview {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
//.next() reads ONE word until space/enter

		/*
		 * System.out.println("please enter your first name"); //String firstName=
		 * Scan.next();
		 * 
		 * System.out.println("please enter your last name"); //String lastName=
		 * Scan.next();
		 * 
		 * 
		 * System.out.println("your full name is:" + firstName + " "+ lastName);
		 */
		System.out.println("--------------------");
		// nextLine()--> reads the whole line until enter is pressed

		/*
		 * System.out.println("please enter your first name"); String firstName=
		 * Scan.nextLine();
		 * 
		 * System.out.println("please enter your last name"); String lastName=
		 * Scan.nextLine(); System.out.println("your full name is:" + firstName + " "+
		 * lastName);
		 * 
		 */

		System.out.println("--------------------------");
		// .next()- .nextInt()- .nextDouble() -.nextBoolean()
		// they all read until the space or enter is activated
		/*
		 * ystem.out.println("please enter int,boolean,and a double"); int num= Scan.
		 * nextInt(); boolean b = Scan. nextBoolean(); double d=Scan. nextDouble();
		 * System.out.println("you entered " +num+" "+b+" "+ d);
		 * 
		 */

		System.out.println("-----------------");
		System.out.println("please enter a long sentence");
		String str1 = Scan.next();
		String str2 = Scan.next();
		String str3 = Scan.nextLine();

		System.out.println("str1-->" + str1);
		System.out.println("str2-->" + str2);
		System.out.println("str3-->" + str3);

		Scan.close();

	}

}
