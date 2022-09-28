package com.banking.helperMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {

	WebDriver ldriver;
	WebDriverWait wait;

	public WaitTypes(WebDriver rdriver) {
		ldriver = rdriver;

	}

	public WebElement waitForElementToBeClickable(WebElement Element, int timeout) {

		try {
			wait = new WebDriverWait(ldriver, timeout);
			wait.until(ExpectedConditions.elementToBeClickable(Element));
		} catch (Exception e) {
			e.getMessage();
		}
		return Element;
	}

	public WebElement waitforElementToBeDisplayed(WebElement Element, int timeout) {
		try {
			wait = new WebDriverWait(ldriver, timeout);
			wait.until(ExpectedConditions.visibilityOf(Element));
		} catch (Exception e) {
			e.getMessage();
			System.out.println("" + e.getStackTrace());
		}
		return Element;
	}

	public WebElement waitforPresenceOfElementLocated(WebElement Element, int timeout) {
		try {
			wait = new WebDriverWait(ldriver, timeout);
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(Element)));
		} catch (Exception e) {
			e.getMessage();
			System.out.println("" + e.getStackTrace());
		}
		return Element;
	}
}
