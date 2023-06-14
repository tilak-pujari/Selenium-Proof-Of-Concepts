package com.part2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

	public static void main(String[] args) throws InterruptedException {

		String chromepath = "C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\chromedriver.exe";

		String productname = "iphone";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.co.in");

		WebElement searchbtn = driver.findElement(By.id("twotabsearchtextbox"));
		searchbtn.sendKeys(productname, Keys.ENTER);

		driver.close();
	}
}