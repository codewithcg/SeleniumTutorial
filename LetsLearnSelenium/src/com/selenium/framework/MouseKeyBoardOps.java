package com.selenium.framework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class MouseKeyBoardOps extends BaseSeleniumTest {

	@Test
	public void contextMenu() {
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		test.log(LogStatus.INFO, "Navigated to the URL was successful");
		Actions actions = new Actions(driver);
		WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		actions.contextClick(rightClickBtn).perform();
		test.log(LogStatus.INFO, "Right click button was right clicked using selenium context menu");
		driver.findElement(By.xpath("//li/span[text()='Edit']")).click();
		test.log(LogStatus.INFO, "Click on Edit");
		Alert alert = driver.switchTo().alert();
		test.log(LogStatus.INFO, "Switching to an Alert");
		alert.accept();
		test.log(LogStatus.INFO, "Closing the Alert");
	}

	// @Test
	public void MouseKeyActions() {

		driver.get("https://the-internet.herokuapp.com/login");
		Actions actions = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));

		actions.moveToElement(link).click(link).perform();
		test.log(LogStatus.INFO, "Clicked on Elemental Selenium");
	}

	// @Test
	public void keyboardAction() {
		driver.get("https://the-internet.herokuapp.com/login");

		Actions actions = new Actions(driver);
		WebElement username = driver.findElement(By.id("username"));

		actions.keyDown(username, Keys.SHIFT);
		actions.sendKeys("tomsmith");
		actions.keyUp(Keys.SHIFT);
		actions.doubleClick();
		actions.perform();
		test.log(LogStatus.INFO, "DoubleClick was successful");

	}
}
