package com.vkontakte.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.object.AbstractBasePage;

public class ForgotPassword extends AbstractBasePage {

	@FindBy(xpath = "//div[@id='forgot_panel']//div[@class='page_block_header_inner _header_inner']")
	private WebElement titleForgotPassword;

	public ForgotPassword(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean checkTitleForgotPassword() {

		return waitAndCheck(titleForgotPassword);

	}

	public ForgotPassword methodSwitchForgotPasswordPage() {

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		return new ForgotPassword(driver);
	}

}
