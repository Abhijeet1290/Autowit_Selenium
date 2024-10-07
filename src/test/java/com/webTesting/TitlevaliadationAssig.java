package com.webTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitlevaliadationAssig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
				
				// Create driver session or launch the browser
				WebDriver driver = new ChromeDriver();
				
				// Open URL or Open the Application
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				//get title of application
				
				String actTitle= driver.getTitle();
				
				//Expected Title
				String ExpTitle= "OrangeHRM";
				
				if(actTitle.equals(ExpTitle)){
					System.out.println("Title Matched   test passed");
				}
				else {
					System.out.println("Title Not Matched   test Failed");	
			}
               //close the browser
				driver.quit();
				
		}

	}

 
