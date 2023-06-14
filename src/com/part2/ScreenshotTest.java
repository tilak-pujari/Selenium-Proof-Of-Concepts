package com.part2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {

		String chromepath = "C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.co.in");

		WebElement amazonLogo = driver.findElement(By.id("nav-logo-sprites"));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = amazonLogo.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/logo.png");
		FileUtils.copyFile(src, trg);

		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File trg1 = new File("./screenshot/homepage.png");
		FileUtils.copyFile(src1, trg1);
	}

}