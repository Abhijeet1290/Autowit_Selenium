package com.webTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titlevalidation {

	public static void main(String[] args) {

		// Create driver session or Launching the browser instance
		
		WebDriver driver = new ChromeDriver();
		
		// Open application or open the URL
		
		driver.get("https://www.google.com");
		
		//get the title of application
		String actTitle = driver.getTitle();
		
		//expected Title
		String ExpTitle = "Google";
		
		if(actTitle.equals(ExpTitle)) {
			System.out.println("Title Matched   test passed");
		}
		else {
			System.out.println("Tile not matched test failed");
		}
		//close the browser use close() or quit()
		
		//driver.close();
		driver.quit();
		
	}
	

}
