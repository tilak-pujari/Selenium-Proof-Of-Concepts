package com.part2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProductPageNextTest {

	List<WebElement> products;

	@Test(priority = 1)
	public void testProductList() throws InterruptedException {

		String chromepath = "C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\chromedriver.exe";

		String productname = "iphone";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.co.in");

		WebElement searchbtn = driver.findElement(By.id("twotabsearchtextbox"));
		searchbtn.sendKeys(productname, Keys.ENTER);

		for (int i = 1; i < 3; i++) {
			Thread.sleep(2000);
			products = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone')]"));
			for (WebElement product : products) {
				System.out.println(product.getText());
			}
			WebElement nextbtn = driver.findElement(By.linkText("Next"));
			nextbtn.click();
		}
	}
}