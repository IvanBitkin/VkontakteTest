package com.framework.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserWebDriver {
	
	public enum BrowserType {

		FIREFOX, CHROME

	}

	public static WebDriver startBrowser(BrowserType type) {

		WebDriver driver;

		switch (type) {
		case FIREFOX:
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chrome/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		default:
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		}

		return driver;

	}

}
