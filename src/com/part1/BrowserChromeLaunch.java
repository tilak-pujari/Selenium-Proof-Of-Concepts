package com.part1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserChromeLaunch {

	public static void main(String[] args) {
		String chromepath="C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\chromedriver.exe";
		String edgepath="C:\\Users\\91740\\OneDrive\\Desktop\\Selenium\\msedgedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		// ("key","path of browser server")
		ChromeDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", edgepath);
		EdgeDriver driver2 = new EdgeDriver();
	}
}