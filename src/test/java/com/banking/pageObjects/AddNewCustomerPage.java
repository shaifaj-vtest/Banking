package com.banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {

	WebDriver ldriver;

	public AddNewCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//a[@href='addcustomerpage.php']")
	WebElement NewCustomerLink;

	@FindBy(xpath = "//input[@name='name']")
	WebElement CustomerName;

	@FindBy(xpath = "(//input[@name='rad1'])[1]")
	WebElement Gender;

	@FindBy(xpath = "//input[@type='date']")
	WebElement DOB;

	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement Address;

	@FindBy(xpath = "//input[@name='city']")
	WebElement City;

	@FindBy(xpath = "//input[@name='state']")
	WebElement State;

	@FindBy(xpath = "//input[@name='pinno']")
	WebElement Pin;

	@FindBy(xpath = "//input[@name='telephoneno']")
	WebElement MobileNo;

	@FindBy(xpath = "//input[@name='emailid']")
	WebElement Email;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='sub']")
	WebElement submit;

	public void ClickAddNewCustomer() {
		NewCustomerLink.click();

	}

	public void CustomerName(String cname) {
		CustomerName.sendKeys(cname);

	}

	public void gender() {
		Gender.click();

	}

	public void DateofBirth(String dd) {
		DOB.sendKeys(dd);
//		DOB.sendKeys(mm);
//		DOB.sendKeys(yy);

	}

	public void address(String Custaddr) {
		Address.sendKeys(Custaddr);

	}

	public void City(String Custcity) {
		City.sendKeys(Custcity);

	}

	public void State(String Custstate) {
		State.sendKeys(Custstate);

	}

	public void Pin(String Custpin) {
		Pin.sendKeys(Custpin);

	}

	public void MobileNumber(String Custmobileno) {
		MobileNo.sendKeys(Custmobileno);

	}

	public void Email(String CustEmailID) {
		Email.sendKeys(CustEmailID);

	}

	public void Password(String CustPassword) {
		password.sendKeys(CustPassword);

	}

	public void ClickSubmit() {
		submit.click();

	}

}
