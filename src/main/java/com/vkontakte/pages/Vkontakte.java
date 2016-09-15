package com.vkontakte.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.object.AbstractBasePage;

public class Vkontakte extends AbstractBasePage {

	/*
	 * Sing In
	 */

	@FindBy(xpath = "//div[@id='index_login']//input[@id='index_email']")
	private WebElement fieldLogin;
	@FindBy(xpath = "//div[@id='index_login']//input[@id='index_pass']")
	private WebElement fieldPassword;
	@FindBy(xpath = "//div[@id='index_login']//button[@id='index_login_button']")
	private WebElement enterButton;
	@FindBy(xpath = "//div[@id='ij_form']")
	private WebElement registerForm;

	/*
	 * Register Form
	 */

	@FindBy(xpath = "//div[@id='ij_form']/input[@id='ij_first_name']")
	private WebElement registerFirstName;
	@FindBy(xpath = "//div[@id='ij_form']/input[@id='ij_last_name']")
	private WebElement registerLastName;

	@FindBy(xpath = "//div[@id='ij_birthdate_row']//td[@id='dropdown1']")
	private WebElement registerDays;
	@FindBy(xpath = "//div[@id='ij_birthdate_row']//td[@id='dropdown2']")
	private WebElement registerMonths;
	@FindBy(xpath = "//div[@class='ij_byear']//td[@id='dropdown3']")
	private WebElement registerYears;

	@FindBy(xpath = "//div[@id='container1']//div[@class='result_list result_list_scrollable']/ul/li[4]")
	private WebElement registerSelectionDays;
	@FindBy(xpath = "//div[@id='container2']//div[@class='result_list result_list_scrollable']/ul/li[2]")
	private WebElement registerSelectionMonths;
	@FindBy(xpath = "//div[@id='container3']//div[@class='result_list result_list_scrollable']/ul/li[2]")
	private WebElement registerSelectionYears;

	@FindBy(xpath = "//button[@id='ij_submit']")
	private WebElement registerButton;
	@FindBy(xpath = "//div[@id='ij_sex_row']/div[@class='radiobtn']")
	private WebElement registerRadioMan;

	/*
	 * Forgot password
	 */

	@FindBy(xpath = "//div[@class='forgot']/a[@id='index_forgot']")
	private WebElement forgotPassword;

	public Vkontakte(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public TestEE2016 enterLoginPasswordField() {

		fieldLogin.sendKeys("+380634270114");
		fieldPassword.sendKeys("testee2016");
		waitAndClick(enterButton);
		return new TestEE2016(driver);

	}

	public boolean checkRegisterForm() {

		return waitAndCheck(registerForm);

	}

	public void registerName() {

		registerFirstName.sendKeys("Ivan");
		registerLastName.sendKeys("Ivanov");

	}

	public void clickOnDay() {

		waitAndClick(registerDays);

	}

	public void selectDay() {

		waitAndClick(registerSelectionDays);

	}

	public void clickOnMonth() {

		waitAndClick(registerMonths);

	}

	public void selectMonth() {

		waitAndClick(registerSelectionMonths);

	}

	public void clickOnYear() {

		waitAndClick(registerYears);

	}

	public void selectYear() {

		waitAndClick(registerSelectionYears);

	}

	public boolean selectRadioMan() {
		waitAndClick(registerButton);
		waitAndClick(registerRadioMan);
		return false;
	}

	public Register enterRegisterButton() {

		waitAndClick(registerButton);
		return new Register(driver);
	}

	public ForgotPassword clickOnForgotPasswordButton() {

		waitAndClick(forgotPassword);
		return new ForgotPassword(driver);

	}

}
