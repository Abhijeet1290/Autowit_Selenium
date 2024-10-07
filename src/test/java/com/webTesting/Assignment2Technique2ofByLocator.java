package com.webTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Technique2ofByLocator {

	public static void main(String[] args) {
		
		// lauch the browser
		WebDriver driver = new ChromeDriver();
		
		// open the URL
		
		driver.get("https://www.google.com");
		
		//Technique 2==== By loactors
		// By LocatoreDirect Identify) + Validation + Action
		
		// 1. Identify
		
		driver.findElement(By.id("APjFqb"));
		//we need to declare it
		
		WebElement ele =driver.findElement(By.id("APjFqb"));
		
		
		// 2. Valiadtion
		if(ele.isDisplayed()&& ele.isEnabled()) {
		//  3. Action
		
		ele.sendKeys("selenium", Keys.ENTER);
		}
		
		
		
		
		
		

	}

}
