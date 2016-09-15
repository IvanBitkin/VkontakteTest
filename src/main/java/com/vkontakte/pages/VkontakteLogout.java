package com.vkontakte.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.object.AbstractBasePage;

public class VkontakteLogout extends AbstractBasePage {

	@FindBy(xpath = "//div[@id='side_bar_inner']//button[@id='quick_reg_button']")
	private WebElement registerButton;
	@FindBy(xpath = "//div[@id='top_nav']//a[@href='/']")
	private WebElement topLogoButton;

	public VkontakteLogout(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean checkRegisterButton() {

		return waitAndCheck(registerButton);

	}
	
	public Vkontakte clickOnLogoButton() {
		
		waitAndClick(topLogoButton);
		return new Vkontakte(driver);
		
	}

}
