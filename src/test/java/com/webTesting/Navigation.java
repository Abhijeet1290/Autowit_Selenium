package com.webTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// create driver session or Launch driver
		WebDriver driver = new ChromeDriver();
		
		// open URL or launch the application
		driver.get("https://www.google.com");
		
		// navigate to Facebook from Google
		
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		//Navigate to back
		driver.navigate().back();
		
		Thread.sleep(1000);
		// Refreash the page
		driver.navigate().refresh();
		
		// Forward to facebook
		Thread.sleep(3000);
		driver.navigate().forward();
		
		//Navigate to Back
		driver.navigate().back();
		
		
		
	}

}
