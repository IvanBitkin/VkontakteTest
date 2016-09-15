package com.web.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.object.AbstractVKontakteTest;

public class MyPageVkTest extends AbstractVKontakteTest {

	@BeforeClass
	public void beforeClass() {

		vkontakte = mainPage.openVkontakte();

	}

	@AfterClass
	public void afterClass() {

		mainPage.quitBrowser();

	}

	@Test(priority = 10)
	public void myPageTest() {

		testEE2016 = vkontakte.enterLoginPasswordField();
		myPage = testEE2016.clickOnMyPageButton();
		Assert.assertEquals(myPage.checkPageBody(), true, "Element not found");

	}

	@Test(priority = 20)
	public void newsTest() {

		newsPage = myPage.clickOnNewsButton();
		Assert.assertEquals(newsPage.checkNews(), true, "Element not found");

	}
	
	@Test(priority = 30)
	public void messageTest() {
		
		 myPage = newsPage.clickOnMyPage();
		 messagePage = myPage.clickOnMessageButton();
		 Assert.assertEquals(messagePage.checkMessage(), true, "Element not found");
		
	}
	
	@Test(priority = 40)
	public void friendsTest() {
		
		myPage = messagePage.clickOnMyPage();
		friendsPage = myPage.clickOnFriendsButton();
		Assert.assertEquals(friendsPage.checkFriends(), true, "Element not found");
		
	}
	
	@Test(priority = 50)
	public void groupsTest() {
		
		myPage = friendsPage.clickOnMyPage();
		groupsPage = myPage.clickOnGroupsButton();
		Assert.assertEquals(groupsPage.checkGroups(), true, "Element not found");
			
	}
	
	@Test(priority = 60)
	public void fotoTest() {
		
		myPage = groupsPage.clickOnMyPage();
		fotoPage = myPage.clickOnFotoButton();
		Assert.assertEquals(fotoPage.checkFoto(), true, "Element not found");
		
	}
	
	@Test(priority = 70)
	public void audioTest() {
		
		myPage = fotoPage.clickOnMyPage();
		audioPage = myPage.clickOnAudioButton();
		Assert.assertEquals(audioPage.checkAudio(), true, "Element not found");
		
	}
	
	@Test(priority = 80)
	public void videoTest() {
		
		myPage = audioPage.clickOnMyPage();
		videoPage = myPage.clickOnVideoButton();
		Assert.assertEquals(videoPage.checkVideo(), true, "Element not found");
		
		
	}
	
	@Test(priority = 90)
	public void gamesTest() {
		
		myPage = videoPage.clickOnMyPage();
		gamesPage = myPage.clickOnGamesButton();
		Assert.assertEquals(gamesPage.checkGames(), true, "Element not found");
		
	}
	
	@Test(priority = 100)
	public void createNewMessageAndCheckAllMessageTest() {
		
		myPage = gamesPage.clickOnMyPage().createNewMessage();
		Assert.assertEquals(myPage.checkAllMessage(), true, "Element not found");
		
	}
	
	
}
