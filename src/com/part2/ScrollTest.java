package com.part2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTest {

	public static void main(String[] args) throws InterruptedException {

		String chromepath = "C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.co.in");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//Scroll Down
		jse.executeScript("window.scrollBy(0,4000);");
		Thread.sleep(2000);
		//Scroll Up
		jse.executeScript("window.scrollBy(0,-4000);");
		Thread.sleep(2000);
		driver.close();

	}
}