//package com.scenarios;
//
//import java.io.File;
//import java.time.Duration;
//import java.util.Set;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//
//public class TestYantra1 {
//
//	public static void main(String[] args) {
//		System.setProperty("key", "path of browser server");
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--disable-notifications");
//		WebDriver driver=new ChromeDriver(opt);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.get("URL");
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		WebElement namefield=driver.findElement(By.lacators());
//		jse.executeScript("arguments[0].scrollIntoView(true);",namefield);
//		namefield.submit();//if type='submit';
//		Alert alt=driver.switchTo().alert();
//		alt.accept();
//		
//		String mainid=driver.getWindowHandle();
//		Set<String> allid=driver.getWindowHandles();
//		
//		for(String id:allid) {
//			if(!(mainid.equals(id))){
//				driver.switchTo().window(id);
//				String title=driver.getTitle();
//				if(title.equals(title2)) {
//					driver.switchTo().frame("FrameWebElement1");
//				}
//			}
//		}
//		driver.switchTo().frame("FrameWebElement2");
//		WebElement dropdown=driver.findElement(By.Locators());
//		Select s=new Select(dropdown);
//		s.selectByVisibleText("Your_name");
//		WebElement button=driver.findElement(By.Locators());
//		Actions act=new Actions(driver);
//		act.doubleClick(button).perform();
//		driver.switchTo().window(mainid);
//		
//		for(String id:allid) {
//			if(!(mainid.equals(id))) {
//				driver.switchTo().window(id);
//				driver.close();
//			}
//			else {
//				driver.switchTo().window(id);
//			}
//			
//		}
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File trg=new File("./screenshot/homepage.png");
//		FileUtils.copyFile(src, trg);
//			
//	}
//}
