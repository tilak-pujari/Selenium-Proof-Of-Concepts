package com.selenium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_BrowserLaunch {

	public static void main(String[] args) {

/*		 Invoking Browser
		 Chrome - ChromeDriver exten->Methods close get
		 Firefox- FirefoxDriver ->methods close get
		 WebDriver close get
		 WebDriver methods + class methods
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver(options);*/
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		/*
		 System.setProperty("webdriver.gecko.driver",
		 "C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\drivers\\geckodriver.exe");
		  WebDriver driver1 = new FirefoxDriver();
		 
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\drivers\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
*/
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		// driver.quit();
	}
}