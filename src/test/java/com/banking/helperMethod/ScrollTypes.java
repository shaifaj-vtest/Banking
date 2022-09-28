package com.banking.helperMethod;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollTypes {

	WebDriver ldriver;

	public ScrollTypes(WebDriver rdriver) {
		ldriver = rdriver;

	}

	public void scrollDown() {
		((JavascriptExecutor) ldriver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

	public void scrollUp() throws AWTException {
		((JavascriptExecutor) ldriver).executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	}

	public void scrollByParameter(int x, int y) {
		((JavascriptExecutor) ldriver).executeScript("window.scrollBy(" + x + "," + y + ")");
	}

	public void scrollInToView(WebElement element) {
		JavascriptExecutor je = (JavascriptExecutor) ldriver;
		je.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
