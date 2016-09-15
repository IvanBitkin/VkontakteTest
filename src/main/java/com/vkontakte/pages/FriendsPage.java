package com.vkontakte.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.object.AbstractBasePage;

public class FriendsPage extends AbstractBasePage{
	
	@FindBy(xpath = "//li[@id='l_pr']/a//span[@class='left_label inl_bl']")
	private WebElement myPage;
	@FindBy(xpath = "//a[@id='ui_rmenu_all']")
	private WebElement checkFriends;
	
	public FriendsPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean checkFriends() {
		
		return waitAndCheck(checkFriends);
		
	}
	
	public MyPage clickOnMyPage() {

		waitAndClick(myPage);
		return new MyPage(driver);

	}

}
