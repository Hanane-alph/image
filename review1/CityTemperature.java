package com.neotech.review1;

import java.util.Scanner;

public class CityTemperature {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		/*
		 * 3. Create a Java program that will ask user to input city and temperature.
		 * Your program should convert Fahrenheit into Celsius and print
		 * "The temperature is the city __ is __"
		 */

		String city;

		double f, c;

		System.out.println();

		System.out.println("what is your city ");
		city = scan.next();

		System.out.println("what's the temperature in f ");
		f = scan.nextDouble();

		c = (f - 32) * 5 / 9;

		System.out.println(" your city " + city + "and temperature " + c);
		scan.close();

	}

}
