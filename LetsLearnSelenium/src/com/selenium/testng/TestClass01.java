package com.selenium.testng;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass01 {

	@Test
	public void method01() {

		System.out.println("Automation Started");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(2000, 400));
		driver.get("https://the-internet.herokuapp.com/");
		String title = driver.getTitle();
		System.out.println("Title : " + title);
		Assert.assertNotEquals(title, "The Internet2");
		// driver.close();
	}

	public void method02() {

		System.out.println("Automation Started");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(2000, 400));
		driver.get("https://the-internet.herokuapp.com/");
		String title = driver.getTitle();
		System.out.println("Title : " + title);
		driver.close();
	}

}
