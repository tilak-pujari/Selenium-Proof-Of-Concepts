package com.scenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TCP_03_LoginAddToCart {

	public static void main(String[] args) throws InterruptedException {

		String name = "rahulshettyacademy";
		String password = "learning";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.cssSelector("[value='user']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();
		WebElement dd = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select s = new Select(dd);
		s.selectByVisibleText("Consultant");
		driver.findElement(By.cssSelector(".text-white.termsText")).click();
		driver.findElement(By.id("signInBtn")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card-footer>button")));
		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer>button"));

		int count = 0;
		for (WebElement product : products) {
			product.click();
			count++;
			if (products.size() == count) {
				break;
			}
		}

		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();

		String deliveryLocationMsg = driver.findElement(By.cssSelector("[for='country']")).getText();
		System.out.println(deliveryLocationMsg);
	}

}
