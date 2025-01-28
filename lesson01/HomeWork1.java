package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork1 {
	//HW1: Amazon Page Title Verification: 
	//	Open chrome browser
	//	Go to “https://www.amazon.com/”
	//	Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
	//	End the Session (close the browser).

	public static void main(String[] args) throws InterruptedException {
		//
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		// no
String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
			String actualTile=driver.getTitle();
		if(expectedTitle.equals(actualTile)) {
			System.out.println("Title is-->:"+ driver.getTitle());
		}else {System.out.println("this is the wrong title");}
		//
		Thread.sleep(5000);// this is a java method(not coming from selenium)
		// we use it to stop the code so that we can visually inspect the result/test.
		driver.quit();
		
		
		
		
		
		
	}

}
