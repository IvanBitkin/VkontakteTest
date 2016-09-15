package com.vkontakte.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.object.AbstractBasePage;

public class MyPage extends AbstractBasePage {

	@FindBy(xpath = "//div[@id='page_body']")
	private WebElement pageBody;
	@FindBy(xpath = "//li[@id='l_nwsf']//span[@class='left_label inl_bl']")
	private WebElement news;
	@FindBy(xpath = "//li[@id='l_msg']//span[@class='left_label inl_bl']")
	private WebElement message;
	@FindBy(xpath = "//li[@id='l_fr']//span[@class='left_label inl_bl']")
	private WebElement friends;
	@FindBy(xpath = "//li[@id='l_gr']//span[@class='left_label inl_bl']")
	private WebElement groups;
	@FindBy(xpath = "//li[@id='l_ph']//span[@class='left_label inl_bl']")
	private WebElement foto;
	@FindBy(xpath = "//li[@id='l_aud']//span[@class='left_label inl_bl']")
	private WebElement audio;
	@FindBy(xpath = "//li[@id='l_vid']//span[@class='left_label inl_bl']")
	private WebElement video;
	@FindBy(xpath = "//li[@id='l_ap']//span[@class='left_label inl_bl']")
	private WebElement games;

	@FindBy(xpath = "//div[@id='post_field']")
	private WebElement newMessage;
	@FindBy(xpath = "//button[@id='send_post']")
	private WebElement enterMessage;
	@FindBy(xpath = "//ul[@id='wall_tabs']/li[1]/a[@class='ui_tab ui_tab_sel']")
	private WebElement checkAllMessage;

	public MyPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean checkPageBody() {

		return waitAndCheck(pageBody);

	}

	public NewsPage clickOnNewsButton() {

		waitAndClick(news);
		return new NewsPage(driver);

	}

	public MessagePage clickOnMessageButton() {

		waitAndClick(message);
		return new MessagePage(driver);

	}

	public FriendsPage clickOnFriendsButton() {

		waitAndClick(friends);
		return new FriendsPage(driver);

	}

	public GroupsPage clickOnGroupsButton() {

		waitAndClick(groups);
		return new GroupsPage(driver);

	}

	public FotoPage clickOnFotoButton() {

		waitAndClick(foto);
		return new FotoPage(driver);

	}

	public AudioPage clickOnAudioButton() {

		waitAndClick(audio);
		return new AudioPage(driver);

	}

	public VideoPage clickOnVideoButton() {

		waitAndClick(video);
		return new VideoPage(driver);

	}

	public GamesPage clickOnGamesButton() {

		waitAndClick(games);
		return new GamesPage(driver);

	}

	public MyPage createNewMessage() {

		newMessage.sendKeys("Hello Indeema");
		waitAndClick(enterMessage);
		
		return new MyPage(driver);

	}
	
	public boolean checkAllMessage() {
		
		return waitAndCheck(checkAllMessage);
		
	}

}
