package com.scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TCP_01Checkbox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement option1 = driver.findElement(By.id("checkBoxOption1"));
		option1.click();
		Assert.assertTrue(option1.isSelected());
		System.out.println("Option 1 is Checked");
		option1.click();
		Assert.assertFalse(option1.isSelected());
		System.out.println("Option 1 is Unchecked");

		List<WebElement> checkboxes = driver.findElements(By.cssSelector("[type='checkbox']"));
		System.out.println(checkboxes.size());
	}

}
