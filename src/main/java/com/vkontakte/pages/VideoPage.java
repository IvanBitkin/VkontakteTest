package com.vkontakte.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.object.AbstractBasePage;

public class VideoPage extends AbstractBasePage{

	@FindBy(xpath = "//li[@id='l_pr']/a//span[@class='left_label inl_bl']")
	private WebElement myPage;
	@FindBy(xpath = "//li[@id='videocat_tab_catalog']/a")
	private WebElement checkVideo;
	
	public VideoPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public MyPage clickOnMyPage() {

		waitAndClick(myPage);
		return new MyPage(driver);

	}

	public boolean checkVideo() {

		return waitAndCheck(checkVideo);

	}
	
	
}
