//List<WebElement> allfeatures = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
package com.part1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonNavBar {

	@Test(priority = 1)
	public void launchApplication() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");

		List<WebElement> features = driver.findElements(By.xpath("//div[@id='nav-main']/div[2]/div/div/a"));

		for (WebElement feature : features) {
			if (!feature.getText().equals("")) {
				System.out.println(feature.getText());
			}
		}
		driver.quit();
	}
}