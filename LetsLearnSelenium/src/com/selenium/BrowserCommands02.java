package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands02 {

	public static void main(String[] args) {

		System.out.println("Automation Started");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(2000, 400));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Form Authentication")).click();
		WebElement ele = driver.findElement(By.xpath("//*[@id='username']"));
		ele.sendKeys("tomsmith");
		// Point pt = ele.getLocation();
		// System.out.println(pt);

		System.out.println(ele.getTagName());
		ele.submit();

		// isDisplayed, Enabled,Selected

		// DRY - Do not repeat yourself

	}

}
