package com.selenium.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseKeyBoardOps extends BaseSeleniumTest {

	// @Test
	public void MouseKeyActions() {

		Actions actions = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));

		actions.moveToElement(link).click(link).perform();
		// actions.click(link);
		// actions.perform();
	}

	@Test
	public void keyboardAction() {

		Actions actions = new Actions(driver);
		WebElement username = driver.findElement(By.id("username"));

		actions.keyDown(username, Keys.SHIFT);
		actions.sendKeys("tomsmith");
		// actions.keyUp(Keys.UP);
		actions.keyUp(Keys.SHIFT);
		actions.perform();

	}
}
