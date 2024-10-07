package com.webTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Technique3ofByLocators {

	public static void main(String[] args) throws Exception {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//open he URl
		driver.get("https://www.google.com");
		
		//Technique 3
		
		//Identify and Perform the action
		
	    driver .findElement(By.id("APjFqb")).sendKeys("TestNG");
	    
	    Thread.sleep(3000);
	    driver.findElement(By.id("APjFqb")).sendKeys("TestNG",Keys.ENTER);
	    
		
		
		
		

	}

}
