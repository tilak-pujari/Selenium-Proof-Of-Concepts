package com.part1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserEdgeLaunch {

	public static void main(String[] args) {

		String edgepath = "C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\msedgedriver.exe";
		System.setProperty("webdriver.chrome.driver", edgepath);
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com");
		driver.close();
	}

}
