package dev.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifySeleniumGridMsg {
	WebDriver driver;
	String expgridmsg="If you want to scale by distributing and running tests on several machines "
			+ "and manage multiple environments from a central point, making it easy to run the tests "
			+ "against a vast combination of browsers/OS, then you want to use Selenium Grid.";
	
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
		String actgridmsg=driver.findElement(By.xpath("//h4[text()='Selenium Grid']/../p[2]")).getText();
		System.out.println(actgridmsg);
		Assert.assertEquals(expgridmsg,actgridmsg);
	}
	
	@Test(priority=3)
	public void closeBrowser() {
		driver.close();
	}
}