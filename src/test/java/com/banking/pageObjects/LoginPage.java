package com.banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//input[@type='text']")
	WebElement UserName;

	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement lgnbtn;

	public void setUserName(String username) {
		UserName.sendKeys(username);

	}

	public void setPassword(String pwd) {
		Password.sendKeys(pwd);

	}

	public void clickSubmit() {
		lgnbtn.click();

	}

}
