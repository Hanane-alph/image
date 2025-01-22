package com.neotech.review1;

public class TypeCasting {

	public static void main(String[] args) {
		// byte< short< int< long< float< double

		int intNumber = 73;
		// widening/ implicit casting/ automatically
		double doubleNumber = intNumber;

		System.out.println("intNumber--<" + intNumber);
		System.out.println("doubleNumber--< " + doubleNumber);
		// narrowing / explicit casting/ manually
		byte byteNumber = (byte) intNumber; // it is risky, we may lose data
		System.out.println("byteNumber--< " + byteNumber);

		// re assign
		intNumber = 730;
		// in this case we will lost data

		byte b2 = (byte) intNumber;
		System.out.println("b2-->" + b2);
		// WIDENING ...
		byte b3 = 50;
		int i3 = b3;
		System.out.println("i3-->" + i3);

		// NARROWING.....
		double d1 = 6.8;
		int i4 = (int) d1;
		System.out.println("i4-->" + i4);

	}

}
