package com.vkontakte.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.object.AbstractBasePage;

public class AudioPage extends AbstractBasePage{
	
	@FindBy(xpath = "//li[@id='l_pr']/a//span[@class='left_label inl_bl']")
	private WebElement myPage;
	@FindBy(xpath = "//a[@id='ui_rmenu_audio_album_384137325_-2']")
	private WebElement checkAudio;

	
	public AudioPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public MyPage clickOnMyPage() {

		waitAndClick(myPage);
		return new MyPage(driver);

	}

	public boolean checkAudio() {

		return waitAndCheck(checkAudio);

	}

}
