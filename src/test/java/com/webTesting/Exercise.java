package com.webTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		// Open application or open the URL
		
		driver.get("https://www.google.com");
		
		//get the title of application
		//String actTitle= driver.getTitle();
		//System.out.println(actTitle);
		
		
		
		/*String b= "Good";
		System.out.println(b);
		
		int a=10;
		System.out.println(a);
		*/
		//get Title of application
		//String actTitle = driver.getTitle();
		
		//compare with Expected Title
		
		String actTitle = driver.getTitle();
		
		
		String ecpTitle = "Google";
		
		
		if(actTitle.equals(ecpTitle)) {
			System.out.println("get result Title match "+ ecpTitle);
			
		}
		else {
			System.out.println(" get result Title not matched");
		}
		//close the browser
		//driver.close();
		driver.quit();
		
		
		
		

	}

}
