package com.neotech.review1;

public class VariableDemo {
	// always format your code
	// ctrl+shift+f

	public static void main(String[] arg) {
//declare a variable
		String firstName; // system.out.println("My name is -->+ firstname")

		// assign a value(initialize)

		firstName = "kAMELA";
		System.out.println("my name is " + firstName);
		// declare a variable and assign a value
		String lastName = "Bendaj";
		int age = 25;

		System.out.println(firstName + " " + lastName + " " + age);

		System.out.println(firstName + " " + lastName + " " + (age + 1));
//re-assign

		age = age + 5;
		System.out.println(age);
		lastName = "Holland";
		System.out.println(firstName + " " + lastName + " " + age);

	}
}
