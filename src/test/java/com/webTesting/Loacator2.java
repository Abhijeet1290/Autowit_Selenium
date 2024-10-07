package com.webTesting;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loacator2 {

	public static void main(String[] args) {
		
	//Launch the browser
		WebDriver driver= new ChromeDriver();
	
	//Open URL
	driver.get("https://automationplayground.com/crm/login.html");	
	
	// Identify the Locator for Email field and perform the action
	
	driver.findElement(By.id("email-id")).sendKeys("ABC@test.com");
	
	//Identify the Locator Password field and perform the action
	driver.findElement(By.id("password")).sendKeys("12345");
	
	
	//Click on check box
	driver.findElement(By.id("remember")).click();
	
	//click on submit button
	
     driver.findElement(By.id("submit-id")).click();
     
	
	
	
	
	
	
	
		

	}

}
