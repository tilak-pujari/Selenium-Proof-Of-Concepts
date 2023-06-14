package com.scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAboutMsg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//a[text()='About']")).click();
		driver.findElement(By.xpath("//a[text()='Sponsors']")).click();
		String msg=driver.findElement(By.xpath("//main[@class='td-main']/div[2]/h2[1]")).getText();
		System.out.println(msg);
		
		driver.close();
	}
}