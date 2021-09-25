package com.selenium.framework;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseSeleniumTest {

	WebDriver driver;
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void oneTimeSetUp() {
		report = new ExtentReports("C:\\Test\\ExtentReport" + System.currentTimeMillis() + ".html", true);
		test = report.startTest("ExtentDemo");
	}

	@BeforeMethod
	public void init() {
		System.out.println("Automation Started");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(2000, 100));
		driver.manage().window().maximize();
		// test.log(LogStatus.INFO, "Navigated to the URL");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@AfterClass
	public void endTest() {
		report.endTest(test);
		report.flush();
	}

}
