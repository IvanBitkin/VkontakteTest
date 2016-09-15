package com.vkontakte.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.object.AbstractBasePage;

public class Register extends AbstractBasePage{
	
	@FindBy(xpath = "//div[@id='content']/div[@class='join_about_wrap']/h2")
	private WebElement checkTitleRegister;
	@FindBy(xpath = "//div[@class='head_nav_item fl_r']/a[@id='top_reg_link']")
	private WebElement clickOnEscape;
	
	public Register(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public boolean checkTitleRegister() {
		
		return waitAndCheck(checkTitleRegister);
		
	}
	
	public Vkontakte clickOnEscapeButton() {
		
		waitAndClick(clickOnEscape);
		return new Vkontakte(driver);
		
	}

}
