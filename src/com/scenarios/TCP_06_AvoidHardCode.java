package com.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TCP_06_AvoidHardCode {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement opt = driver.findElement(By.id("checkBoxOption2"));
		opt.click();
		String label = opt.getAttribute("value");
		System.out.println(label);

		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByValue(label);

		driver.findElement(By.id("name")).sendKeys(label);
		driver.findElement(By.id("alertbtn")).click();
		String alertmsg = driver.switchTo().alert().getText();

		Assert.assertTrue(alertmsg.contains(label));
		System.out.println(label + " is present in alert popup");
	}

}
