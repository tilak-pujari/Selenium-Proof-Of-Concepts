package com.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCP_05_NestedFrames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");

		// click on nested frames link
		driver.findElement(By.linkText("Nested Frames")).click();

		// switch driver focus to parent frame
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));

		// switch driver focus to middle frame
		driver.switchTo().frame(1);// using index of frame
		// driver.switchTo().frame(driver.findElement(By.name("frame-middle")));

		// print the text from middle frame
		System.out.println(driver.findElement(By.id("content")).getText());
	}

}
