package com.part2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TommorrowDate {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	driver.get("https://jqueryui.com/datepicker/");
	Calendar cal=Calendar.getInstance();
	cal.add(Calendar.DAY_OF_YEAR,1);//Tomorrow
	cal.add(Calendar.DAY_OF_YEAR,-1);//Yesterday
	Date currentdate=cal.getTime();
	System.out.println(currentdate);
	SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
	String modifieddate=sdf.format(currentdate);
	System.out.println(modifieddate);
	driver.switchTo().frame(0);
	
	WebElement input=driver.findElement(By.className("hasDatepicker"));
	input.sendKeys(modifieddate,Keys.ESCAPE);
}
}