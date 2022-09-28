package com.banking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageObjects.AddNewCustomerPage;
import com.banking.pageObjects.LoginPage;
import com.banking.utilities.JsonUtils;

public class TC_002_AddNewCustomer extends BaseClass {

	@Test
	public void addnewcustomer() throws InterruptedException {

		LoginPage login = new LoginPage(driver);

		login.setUserName(JsonUtils.getData(com.banking.testData.DefineConstants.TC_001_Login_Data, "UserName"));
		logger.info("Entered username");

		login.setPassword(JsonUtils.getData(com.banking.testData.DefineConstants.TC_001_Login_Data, "Password"));
		logger.info("Entered Password");

		login.clickSubmit();
		logger.info("Click on Submit");

		Thread.sleep(3000);

		AddNewCustomerPage addcust = new AddNewCustomerPage(driver);

		Thread.sleep(4000);
		addcust.ClickAddNewCustomer();
		logger.info("Click on new customer");

		Thread.sleep(3000);
		addcust.CustomerName(JsonUtils.getData(com.banking.testData.DefineConstants.TC_001_Login_Data, "CustomerName"));
		logger.info("Entered Customer name");

		addcust.gender();
		logger.info("Click on Gender");

		addcust.DateofBirth(JsonUtils.getData(com.banking.testData.DefineConstants.TC_001_Login_Data, "DD"));

		addcust.address(JsonUtils.getData(com.banking.testData.DefineConstants.TC_001_Login_Data, "Address"));
		logger.info("Entered customer address");

		addcust.City(JsonUtils.getData(com.banking.testData.DefineConstants.TC_001_Login_Data, "City"));
		logger.info("Entered customer City");

		addcust.State(JsonUtils.getData(com.banking.testData.DefineConstants.TC_001_Login_Data, "State"));
		logger.info("Entered customer state");

		addcust.Pin(JsonUtils.getData(com.banking.testData.DefineConstants.TC_001_Login_Data, "Pin"));
		logger.info("Entered customer pin");

		addcust.MobileNumber(JsonUtils.getData(com.banking.testData.DefineConstants.TC_001_Login_Data, "Mobile"));
		logger.info("Entered customer mobile number");

		String email = randomstring() + "@gmail.com";

		addcust.Email(email);
		// addcust.Email(JsonUtils.getData(com.banking.testData.DefineConstants.TC_001_Login_Data,
		// "Email"));
		logger.info("Entered customer Email Id");

		addcust.Password(JsonUtils.getData(com.banking.testData.DefineConstants.TC_001_Login_Data, "Emailpassword"));
		logger.info("Entered customer password");

		addcust.ClickSubmit();
		logger.info("Click on Submit");

		Thread.sleep(3000);
		boolean result = driver.getPageSource().contains("Customer Registered Successfully!!!");

		if (result == true) {
			Assert.assertTrue(true);
			logger.info("New Customer added successfully");
		} else {
			Assert.assertTrue(false);
			logger.info("New Customer is not added successfully");
		}

	}

}
