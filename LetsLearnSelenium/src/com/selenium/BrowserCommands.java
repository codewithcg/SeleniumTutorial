package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		System.out.println("Automation Started");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

		String title = driver.getTitle();
		System.out.println("Title : " + title);
		System.out.println("Title : " + driver.getCurrentUrl());
		System.out.println("Page Source: " + driver.getPageSource().length());
		driver.close();
		System.out.println("Browser Closed");
	}

}
