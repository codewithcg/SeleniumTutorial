package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) {

		System.out.println("Automation Started");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(2000, 400));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");

		WebElement ele = driver.findElement(By.partialLinkText("Broken"));
		System.out.println(ele.getText());
		ele.click();

		System.out.println("==============");

		// System.out.println(driver.findElement(By.linkText("Dynamic
		// Loading")).getText());

	}

}
