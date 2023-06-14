package com.scenarios;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CricbuzzPointTableScreenshot {
	public static void explicitWait(WebDriver driver, WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeSelected(wb));
	}
	
	public static void scrollByPixels(WebDriver driver,int pixels) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+pixels+");");
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");

		Thread.sleep(2000);
		// WebElement pointsTableLink = driver.findElement(By.linkText("Points Table"));
		WebElement pointsTableLink = driver.findElement(By.xpath("//nav[contains(@id,'navbar')]/a[5]"));
		// explicitWait(driver, pointsTableLink);
		pointsTableLink.click();

		scrollByPixels(driver,200);
		WebElement pointsTable = driver.findElement(By.xpath("//h3[contains(text(),'Points')]/.."));
		// explicitWait(driver, pointsTable);

		File src = pointsTable.getScreenshotAs(OutputType.FILE);
		File trg = new File("./PointsTable/tc.png");
		FileUtils.copyFile(src, trg);

		System.out.println("Screenshot taken!");
	}

}
