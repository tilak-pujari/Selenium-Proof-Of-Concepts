package dev.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeDriverDownload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Projects\\Selenium\\chromedriver_win32\\chromedriver.exe");
		String baseUrl = "https://www.selenium.dev/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(baseUrl);
		
		WebElement downloadbtn=driver.findElement(By.xpath("//span[text()='Downloads']"));
		downloadbtn.click();
		
		WebElement clickBrowsers=driver.findElement(By.xpath("//h2[text()='Platforms Supported by Selenium']/../p[2]/button"));
		clickBrowsers.click();
		
		WebElement chromeDocs=driver.findElement(By.xpath("//h4[text()='Chrome']/../p[1]/a[1]"));
		chromeDocs.click();
		
		WebElement stableVersion=driver.findElement(By.xpath("//span[text()='stable']/../a[1]/span"));
		stableVersion.click();
		
		String mainId=driver.getWindowHandle();
		Set<String> allId=driver.getWindowHandles();
		
		for(String id:allId) {
		if(!(mainId.equals(id))) {
			driver.switchTo().window(id);
			}	
		}
		
		//driver.get("https://chromedriver.storage.googleapis.com/index.html?path=110.0.5481.77/");
		
		WebElement browserZip=driver.findElement(By.xpath("//h1[contains(text(),'Index of')]/../table[1]/tbody[1]/tr[7]/td[2]/a[1]"));
		browserZip.click();
		
		Alert al=driver.switchTo().alert();
		al.dismiss();
		
		/*
		Actions act=new Actions(driver);
		act.keyDown(Keys.ARROW_RIGHT).sendKeys("1").perform();
		act.keyUp(Keys.ARROW_RIGHT).perform();
		act.keyDown(Keys.ENTER).perform();
		act.keyUp(Keys.ENTER).perform();
		*/
	}

}