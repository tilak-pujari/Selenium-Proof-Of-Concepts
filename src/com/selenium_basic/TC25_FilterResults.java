package com.selenium_basic;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class TC25_FilterResults {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/greenkart/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");

		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));

		// 1 results
		List<Object> filteredList = veggies.stream().filter(v-> v.getText().contains("Rice")).collect(Collectors.toList());
		// 1 result
		Assert.assertEquals(veggies.size(), filteredList.size());

	}

}