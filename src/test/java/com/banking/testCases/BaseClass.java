package com.banking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.banking.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;

	protected static Logger logger = LogManager.getLogger(BaseClass.class);

	@Parameters("Browser")
	@BeforeClass
	public void SetUp(String browser) {

		if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxpath());
			driver = new FirefoxDriver();

		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", readconfig.getIEpathh());
			driver = new InternetExplorerDriver();
		}
		driver.get(baseURL);

		driver.manage().window().maximize();
	}

//	@AfterClass
//
//	public void tearDown() {
//		driver.quit();
//	}

	public String randomstring() {
		String generatedString = RandomStringUtils.randomAlphabetic(8);
		return generatedString;
	}

	public static String randomNum() {

		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return generatedString2;
	}

}
