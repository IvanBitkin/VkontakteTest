package com.web.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.object.AbstractVKontakteTest;

public class VkontakteTest extends AbstractVKontakteTest {

	@BeforeClass
	public void beforeClass() {

		vkontakte = mainPage.openVkontakte();

	}

	@AfterClass
	public void afterClass() {

		mainPage.quitBrowser();

	}

	@Test(priority = 10)
	public void loginTestAndCheckNickname() {

		testEE2016 = vkontakte.enterLoginPasswordField();
		Assert.assertEquals(testEE2016.checkNickname(), true, "Element not found");

	}

	@Test(priority = 20)
	public void logoutTestAndCheckRegisterButton() {

		testEE2016.clickOnDropDown();
		vkontakteLogout = testEE2016.clickOnExitButton();
		Assert.assertEquals(vkontakteLogout.checkRegisterButton(), true, "Element not found");

	}

	@Test(priority = 30)
	public void clickOnTopButtonAndCheckRegisteForm() {

		vkontakte = vkontakteLogout.clickOnLogoButton();
		Assert.assertEquals(vkontakte.checkRegisterForm(), true, "Element not found");

	}

	@Test(priority = 40)
	public void registerFormTest() {

		vkontakte.registerName();
		vkontakte.clickOnDay();
		vkontakte.selectDay();
		vkontakte.clickOnMonth();
		vkontakte.selectMonth();
		vkontakte.clickOnYear();
		vkontakte.selectYear();
		vkontakte.selectRadioMan();
		register = vkontakte.enterRegisterButton();
		Assert.assertEquals(register.checkTitleRegister(), true, "Element not found");

	}

	@Test(priority = 50)
	public void clickOnForgorPassword() {

		vkontakte = register.clickOnEscapeButton();
		forgotPassword = vkontakte.clickOnForgotPasswordButton().methodSwitchForgotPasswordPage();
		Assert.assertEquals(forgotPassword.checkTitleForgotPassword(), true, "Element not found");

	}

}
