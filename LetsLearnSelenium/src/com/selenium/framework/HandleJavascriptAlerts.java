package com.selenium.framework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleJavascriptAlerts extends BaseSeleniumTest {

	// @Test
	public void handlejsalertOK() {
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement resultMessage = driver.findElement(By.id("result"));
		Assert.assertEquals(resultMessage.getText(), "You successfully clicked an alert");
	}

	// @Test
	public void handlejsalertOKCancel() {
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		WebElement resultMessage = driver.findElement(By.id("result"));
		Assert.assertEquals(resultMessage.getText(), "You clicked: Cancel");

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		alert = driver.switchTo().alert();
		alert.accept();
		Assert.assertEquals(resultMessage.getText(), "You clicked: Ok");
	}

	@Test
	public void handlejsalertPrompt() {
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hi Lakshmi!");
		alert.accept();
		WebElement resultMessage = driver.findElement(By.id("result"));
		Assert.assertEquals(resultMessage.getText(), "You entered: Hi Lakshmi!");

	}
}
