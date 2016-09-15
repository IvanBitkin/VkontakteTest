package com.base.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractBasePage {
	
	protected WebDriver driver;

	/*
	 * Abstract BrowserWebDriver Methods
	 */

	protected WebElement waitForElementToBeClickable(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		return wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	protected void waitAndClick(WebElement element) {

		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		waitForElementToBeClickable(element).click();

	}

	protected WebElement waitForElementToBeDisplayed(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		return wait.until(ExpectedConditions.visibilityOf(element));

	}

	protected boolean waitAndCheck(WebElement element) {

		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return waitForElementToBeDisplayed(element).isDisplayed();

	}

	protected String waitAndGetText(WebElement element) {

		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return waitForElementToBeDisplayed(element).getText();

	}
	
}
