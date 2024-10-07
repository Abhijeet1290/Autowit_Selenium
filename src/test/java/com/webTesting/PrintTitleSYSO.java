package com.webTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitleSYSO {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
			//Launch the Broswer
			WebDriver driver = new ChromeDriver();
			
			// Open the URL
			driver.get("https://www.google.com");
			
			//get Title
			driver.getTitle();
			System.out.println("Get Title :" + driver.getTitle());
			
			// get the current URL of page
			System.out.println("Current URL is :" +driver.getCurrentUrl());
			Thread.sleep(2000);
			
			// get the page source
			//System.out.println(driver.getPageSource());
			
			
	}

}
