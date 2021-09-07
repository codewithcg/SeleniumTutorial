package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown01 {

	public static void main(String[] args) {

		System.out.println("Automation Started");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(2000, 400));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dropdown")).click();

		WebElement ele = driver.findElement(By.xpath("//*[@id='dropdown']"));
		Select dd = new Select(ele);
		dd.selectByIndex(2);
		dd.selectByValue("1");
		dd.selectByVisibleText("Option 2");

	}

}
