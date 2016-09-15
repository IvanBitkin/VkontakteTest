package com.vkontakte.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.object.AbstractBasePage;

public class GamesPage extends AbstractBasePage{
	
	@FindBy(xpath = "//li[@id='l_pr']/a//span[@class='left_label inl_bl']")
	private WebElement myPage;
	@FindBy(xpath = "//input[@id='s_search']")
	private WebElement checkGames;

	public GamesPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public MyPage clickOnMyPage() {

		waitAndClick(myPage);
		return new MyPage(driver);

	}

	public boolean checkGames() {

		return waitAndCheck(checkGames);

	}
}
