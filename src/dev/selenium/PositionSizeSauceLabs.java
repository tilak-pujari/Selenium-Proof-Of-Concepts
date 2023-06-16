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

public class PositionSizeSauceLabs {
	//height of Logo is: 26,Width of Logo is: 143,X Coordinate of Logo is: 16,Y Coordinate of Logo is: 17
	
	WebDriver driver;
	WebElement saucelogo;
	
	int heightLogo=36,WidthLogo=260,XLogo=451,YLogo=1216;
	
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
		saucelogo=driver.findElement(By.xpath("//img[@alt='Sauce Labs']"));
		Dimension d=saucelogo.getSize();
		System.out.println(d.height+"\n"+d.width);
		Assert.assertEquals(heightLogo,d.height);
		Assert.assertEquals(WidthLogo,d.width);
	}
	
	@Test(priority=3)
	public void testWebElemenXY() {
		Point p=saucelogo.getLocation();
		System.out.println(p.x+"\n"+p.y);
		Assert.assertEquals(XLogo,p.x);
		Assert.assertEquals(YLogo,p.y);
	}
	@Test(priority=4)
	public void closeBrowser() {
		driver.close();
	}
}