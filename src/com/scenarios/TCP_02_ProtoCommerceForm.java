package com.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TCP_02_ProtoCommerceForm {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// name
		driver.findElement(By.name("name")).sendKeys("Rahul");
		// email
		driver.findElement(By.name("email")).sendKeys("rahul@gmail.com");
		// password
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("rahul123");
		// Select checkBox
		driver.findElement(By.id("exampleCheck1")).click();
		// Select Gender
		WebElement genderdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select s = new Select(genderdropdown);
		s.selectByVisibleText("Male");

		// Select employment detail as Student
		driver.findElement(By.xpath("//label[text()='Student']")).click();
		// provide date of Birth
		driver.findElement(By.name("bday")).sendKeys("30-09-1993");
		// click on submit
		driver.findElement(By.cssSelector("[type='submit']")).click();

		// fetch the message
		System.out.println(driver.findElement(By.xpath("//strong[text()='Success!']")).getText());

		// validate the Success message
		if (driver.findElement(By.xpath("//strong[text()='Success!']")).getText().contains("Success")) {
			Assert.assertTrue(true);
			System.out.println("Test Case Run Successfully");
		} else {
			Assert.assertTrue(false);
		}

	}

}
