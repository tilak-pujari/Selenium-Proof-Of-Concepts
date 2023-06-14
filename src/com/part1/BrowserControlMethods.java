package com.part1;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserControlMethods {

	public static void main(String[] args) throws InterruptedException {

		String chromepath = "C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.navigate().to("https://www.amazon.co.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		driver.manage().window().fullscreen();

		Thread.sleep(4000);
		Dimension d = new Dimension(30, 40);
		driver.manage().window().setSize(d);

		Thread.sleep(4000);
		Point p = new Point(100, 200);
		driver.manage().window().setPosition(p);

		// driver.quit();
		driver.close();

	}
}