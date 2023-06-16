package com.part2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsClassEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.amazon.co.in");// launch amazon website

		Actions act = new Actions(driver);
		WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
		act.moveToElement(logo).build();
		WebElement todayDeals = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		act.moveToElement(todayDeals).click().build();
		
//		act.click(todayDeals).build();
//		act.clickAndHold(todayDeals).build();
//		act.release().build();
//		
//		act.moveToElement(todayDeals).doubleClick().build();
//		act.doubleClick(todayDeals).build();
//		
//		act.dragAndDrop(logo, todayDeals).build();
//		act.dragAndDropBy(todayDeals, 0, 10).build();
	}

}

/*
 * The Selenium WebDriver's Advanced User Interactions API allows us to perform
 * operations from keyboard events and simple mouse events to complex events
 * such as dragging-and-dropping, holding a key and then performing mouse
 * operations by using the Actions class, and building a complex chain of events
 * exactly like a user doing these manually. The Actions class implements the
 * builder pattern to create a composite action containing a group of other
 * actions
 * 
 * We need to create an instance of the Actions class by passing the instance of
 * driver class to the constructor in the following way: Actions builder = new
 * Actions(driver);
 */