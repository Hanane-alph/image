package com.neotech.review2;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		// Ask the user to enter 2 numbers
		// Ask the user for the operator (+,-,*,/)
		// Calculate the result using if-else

	Scanner everest= new Scanner(System.in);
	System.out.println("please enter the first num");

	double d1=everest.nextDouble();
		
		
	System.out.println("please enter the second num");
	double d2= everest.nextDouble();

		System.out.println("please enter the oprator(+,-,*,/)");
		String operator = everest.next();
		
		System.out.println(d1 + " " + d2 +" " + operator);
	
		// 2ND WAY
	
		 System.out.println("please enter your operator");

			double result =0;
			switch(operator) {
			   
			case"addition":
				result =d1+d2;
				break;
			case"subtruction": 
				result = d1-d2;
				break;
			case"multiplication":
				result = d1*d2;
				break;
			case"division":
			    result = d1/d2;
			   break;
			
				
				default:System.out.println("invalid operation");
				case"invalid":
					break;}
		if(operator.equals("+")|| operator.equals("-") ||operator.equals("*")||operator.equals("/")) {
			System.out.println("the result is -->" + result);
		}
	
	
	
	
	}

}
