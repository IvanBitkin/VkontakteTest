package com.vkontakte.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.object.AbstractBasePage;

public class FotoPage extends AbstractBasePage {

	@FindBy(xpath = "//li[@id='l_pr']/a//span[@class='left_label inl_bl']")
	private WebElement myPage;
	@FindBy(xpath = "//div[@id='photos_albums_block']//div[@class='page_block_header_inner _header_inner']")
	private WebElement checkFoto;

	public FotoPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public MyPage clickOnMyPage() {

		waitAndClick(myPage);
		return new MyPage(driver);

	}

	public boolean checkFoto() {

		return waitAndCheck(checkFoto);

	}

}
