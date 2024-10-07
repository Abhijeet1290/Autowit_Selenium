package com.webTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3_linkfullPartial {

	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://automationplayground.com/crm/");
		
		//find LinkText for signIn
		//driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.partialLinkText("In")).click();
		
		
		
		
		
		

	}

}
