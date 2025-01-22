package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// if we want to test anything in a we-application, we should follow these steps:
		// 1-open the browser
		    WebDriver driver=new ChromeDriver();
		
		
		
		//2- go to URL
		driver.get("https://www.neotechacademy.com/");    
		//3-do the required test/action
		//we will pause the web=page for few seconds to properly see it
		Thread.sleep(8000);// pause the execution for five seconds
		// 4- close the browser
		driver.quit();
		
		
		

	}

}
