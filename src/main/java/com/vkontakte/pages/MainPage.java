package com.vkontakte.pages;

import com.base.object.AbstractBasePage;
import com.framework.browser.BrowserWebDriver;
import com.framework.browser.BrowserWebDriver.BrowserType;

public class MainPage extends AbstractBasePage{

	public Vkontakte openVkontakte() {

		driver = BrowserWebDriver.startBrowser(BrowserType.CHROME);
		driver.get("https://vk.com");
		return new Vkontakte(driver);

	}

	public void closeBrowser() {

		driver.close();

	}

	public void quitBrowser() {

		driver.quit();

	}
	
}
