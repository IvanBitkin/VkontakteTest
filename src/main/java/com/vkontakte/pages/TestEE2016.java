package com.vkontakte.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.object.AbstractBasePage;

public class TestEE2016 extends AbstractBasePage {

	@FindBy(xpath = "//div[@id='page_header']//div[@class='head_nav_item fl_r']//div[@class='top_profile_name']")
	private WebElement nickname;
	@FindBy(xpath = "//div[@id='page_header']//div[@class='head_nav_item fl_r']//a[@id='top_profile_link']")
	private WebElement dropDown;
	@FindBy(xpath = "//div[@id='top_profile_menu']//a[@id='top_logout_link']")
	private WebElement exitButton;

	@FindBy(xpath = "//li[@id='l_pr']/a//span[@class='left_label inl_bl']")
	private WebElement myPage;
	
	
	

	public TestEE2016(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean checkNickname() {

		return waitAndCheck(nickname);

	}

	public void clickOnDropDown() {

		waitAndClick(dropDown);

	}

	public VkontakteLogout clickOnExitButton() {

		waitAndClick(exitButton);
		return new VkontakteLogout(driver);

	}

	public MyPage clickOnMyPageButton() {
		
		waitAndClick(myPage);
		return new MyPage(driver);
		
	}
	
	

}
