package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork2 {
	//HW2: Opening Page on Firefox Browser
//	Open Firefox browser
//	Navigate to “https://www.redfin.com/”
//	Verify that you have navigated to (https://www.redfin.com/)
//	End the Session (close the browser).
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver drive= new FirefoxDriver();
		drive.get("https://www.redfin.com/");
		String currentURL=drive.getCurrentUrl();
		
		String excpectedURL="https://www.redfin.com/";
		if(currentURL.equals(excpectedURL)) {
			System.out.println(" this is the correct URL--> "+ currentURL);
		}else{System.out.println("the worng URL is being displayed--> "+ currentURL);}
		Thread.sleep(5000);
		drive.quit();
		
		
		
		
		
		

	}

}
