package com.banking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageObjects.LoginPage;
import com.banking.utilities.JsonUtils;

public class TC_001_LoginTest extends BaseClass {

	@Test
	public void LoginTest() throws InterruptedException {

		// driver.get(baseURL);
		logger.info("URL is opened");

		LoginPage login = new LoginPage(driver);

		// login.setUserName(username);
		login.setUserName(JsonUtils.getData(com.banking.testData.DefineConstants.TC_001_Login_Data, "UserName"));
		logger.info("Entered username");

		login.setPassword(JsonUtils.getData(com.banking.testData.DefineConstants.TC_001_Login_Data, "Password"));
		// login.setPassword(password);
		logger.info("Entered Password");

		login.clickSubmit();
		logger.info("Click on Submit");

		Thread.sleep(3000);

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {

			Assert.assertTrue(true);
			logger.info("Login test passed");
		} else {
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}

	}

}
