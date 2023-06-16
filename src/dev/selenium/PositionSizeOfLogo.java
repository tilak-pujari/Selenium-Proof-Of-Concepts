package dev.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositionSizeOfLogo {
	//height of Logo is: 26,Width of Logo is: 143,X Coordinate of Logo is: 16,Y Coordinate of Logo is: 17
	
	WebDriver driver;
	WebElement logo;
	
	int heightLogo=26,WidthLogo=143,XLogo=16,YLogo=17;
	
	@Test(priority=1)
	public void launchWeb() {
	System.setProperty("webdriver.chrome.driver", 
			"D:\\Eclipse Projects\\Selenium\\chromedriver_win32\\chromedriver.exe");
	String baseUrl = "https://www.selenium.dev/";
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(baseUrl);
	}
	
	@Test(priority=2)
	public void testWebElementWidthHeight() {
		logo=driver.findElement(By.className("navbar-logo"));
		Dimension d=logo.getSize();
		System.out.println("height of Logo is: "+d.height);
		System.out.println("Width of Logo is: "+d.width);
		Assert.assertEquals(heightLogo,d.height);
		Assert.assertEquals(WidthLogo,d.width);
	}
	
	@Test(priority=3)
	public void testWebElemenXY() {
		Point p=logo.getLocation();
		System.out.println("X Coordinate of Logo is: "+p.x);
		System.out.println("Y Coordinate of Logo is: "+p.y);
		
		Assert.assertEquals(XLogo,p.x);
		Assert.assertEquals(YLogo,p.y);
	}
	@Test(priority=4)
	public void closeBrowser() {
		driver.close();
	}
}