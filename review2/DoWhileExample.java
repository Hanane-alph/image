package com.neotech.review2;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("Similarities between While & Do While");
System.out.println("--------------------------------------------");
	int age =1;
	while(age<=10) {System.out.println("Happy Birthday! you are" + age +"years old");
	age++;}
	
	
	
	  System.out.println("-----------------------------------"); 
		  int age2=1; do
			  
		  
	 
		  {System.out.println( "Happy Birthday! you are" + age2 + "years old!"); age2++;
	  } while(age2<=10);
	  
	  System.out.println("-----------------------------------");
	  System.out.println("Differences between While & Do While");
	  System.out.println("-----------------------------------");
	  
	  boolean hot=true; 
	  while(!hot) {System.out.println("while loop--> drink!");}
	  do {System.out.println("Do-while loop-->drink!");} 
	  while (!hot);
	  
	  System.out.println("-----------------------------------"); 
	  int num1=1;
	  System.out.println(num1++);// first print, then increment int num2=1;
	  System.out.println(++num1); // first increment, then print
	  
	  
	  
	 
	
	}

}
