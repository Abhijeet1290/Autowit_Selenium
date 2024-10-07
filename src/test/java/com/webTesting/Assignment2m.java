package com.webTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2m {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		// Open the URL
		driver.get("https://www.google.com");
		
		//Technique 1   By Locators
		// By locator(identify) + Validation + Action
		
		
		// 1. find the webelement
		By.id("APjFqb");
		
		// return type of By is By class
		//need to declare this webelements
		
		By searchbox = By.id("APjFqb");
		
		//  Identify the elements
		//how to identify this webelement so we have below method for identify the web element
		driver.findElement(searchbox);
		
		//here find element gives return type is WebElement
		//so we need to declare this
		WebElement ele = driver.findElement(searchbox);
		
		
		// 2. Validation
		// i have element in line no 37, then we need to validate it
		// we verify element is displayed or not but which element which declare in line number 37 
		System.out.println("is the searchbox is displayed on the page: "+ ele.isDisplayed());
		System.out.println("is search box is enabled or not:"+ ele.isEnabled());
		System.out.println("is search box is selected or not:"+ ele.isSelected());
		
		// 3.Action
		
		//we perform the action on the element which we have fine or address
		//which element store in line no 44 ie -> ele
		
		ele.sendKeys("Java",Keys.ENTER);		
		
		
		 
		
		
		
		
		
		
		
		

	}

}
