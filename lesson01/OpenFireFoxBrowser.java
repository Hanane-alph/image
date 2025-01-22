package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// we do not need to add any Jar file. the language bindings are already available in the project
		// Selenium WebDriver will manager downloading the required driver from any browser
		     // in older versions we had to do that ourselves
		// so what are the steps to follow?
		
		//1- open firefox browser
		WebDriver drive= new FirefoxDriver();
		
		//2- navigating to the URL
		drive.get("https://www.neotechacademy.com/");
		String actualURL= drive.getCurrentUrl();
		
		
		String expectedURL="https://www.neotechacademy.com/";
		if(actualURL.equals(expectedURL))
		{
			System.out.println("page title: "+ drive.getTitle());
			
		}else {System.out.println("the url is wrong");}
		
		//3- do the required action/test on the page
		// for now, we will just pause the execution for a few seconds
		Thread.sleep(5000);
		drive.quit();
		
		// BIDRECTIONAL   BIDI
	}

}
