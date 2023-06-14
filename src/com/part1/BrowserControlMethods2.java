package com.part1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserControlMethods2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//to launch WebSite we use get() 
		driver.get("https://www.google.co.in");
		
		//to get title of Webpage
		String title=driver.getTitle();
		System.out.println(title);
		
		//to get the url of current webpage
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//to get the page Source of current webpage
		String src=driver.getPageSource();
		System.out.println(src);
	}

}
