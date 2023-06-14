package com.part1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigateMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("https://www.google.co.in");//launch google website
		driver.navigate().to("https://www.amazon.co.in");//launch amazon website
		
		driver.navigate().back();//go back
		
		driver.navigate().forward();//go forward
		
		driver.navigate().refresh();// refresh the page
	}

}
