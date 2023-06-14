package com.part1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserControlMethods1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		//To Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		//To Stop Execution for some Seconds we Use Thread.sleep(ms);
		Thread.sleep(2000);
		//Maximize the Browser Window
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//Minimize the Browser Window
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		//set Browser Window as FullScreen
		driver.manage().window().fullscreen();
		
		Thread.sleep(2000);
		//set Height and Width of Browser
		driver.manage().window().setSize(new Dimension(50,100));
		
		Thread.sleep(2000);
		//set X and Y Co-ordinates of Browser
		driver.manage().window().setPosition(new Point(200,500));
		
		//to Close the Browser Window which is on focus of driver
		driver.close();
		//to Close all the Browser Windows
		//driver.quit();
	}

}
