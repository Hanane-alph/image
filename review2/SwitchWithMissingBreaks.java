package com.neotech.review2;

public class SwitchWithMissingBreaks {

	public static void main(String[] args) {
		int number = 1;
		switch(number) {
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
		case 6:
			System.out.println("6");
			break;
		case 7:
			System.out.println("7");
		default:
			System.out.println("The number was not 3,4,5,6,7");
		}
// limitation  of switch-case
// 1. you cannot have a duplicate cases
// 2. you should be careful with breaks
// 3. you use logical operators like in the If=else 
		if (number==3|| number==5||number==7) {
		}	
		if (number >5)	{ }// you cannot use greater
		// 4. you cannot use double
		double d=3.4;
		if(d==5.2) {}
		else {}	
	
	
	
	
	
	
	
	
	}

}
