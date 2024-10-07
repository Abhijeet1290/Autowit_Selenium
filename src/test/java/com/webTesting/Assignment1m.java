package com.webTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1m {
		
		public static void main(String[]args) throws InterruptedException{
			
			//launch the browser
			WebDriver driver = new ChromeDriver();
			
			//open the url
			driver .get("https://www.razorpay.com");
			
			//get the Title of application
			String actTitle= driver.getTitle();
			
			
			// expected title
			String expTitle = "razorpay";
			
			// navigate to google
			driver.navigate().to("https://www.google.com");
			
			/*Thread.sleep(3000);
			
			// Navigate to Back
			driver.navigate().back();
			Thread.sleep(3000);
			
			// Navigate to forward
			driver.navigate().forward();
			
			//refresh the page
			driver.navigate().refresh();
			Thread.sleep(3000);
			 
			//naviagte to Facebook
			driver.get("https://www.facebook.com");
			*/
			
			//
			
			
			
			
				
			
		}

	}

