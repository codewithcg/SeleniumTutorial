package com.selenium.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitClassDemo {

	// @Test
	public void demoWait() throws InterruptedException {

		System.out.println("Automation Started");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(2000, 400));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		Thread.sleep(5000); // Not recommended
		driver.findElement(By.xpath("//button[text()='Disable']")).click();
		// Thread.sleep(10000);
		// driver.findElement(By.xpath("//button[text()='Remove']")).click();
	}

	// @Test
	public void demoWaitImplicit() {

		System.out.println("Automation Started");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().setPosition(new Point(2000, 400));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		driver.findElement(By.xpath("//button[text()='Disable']")).click();
		// driver.close();
		driver.findElement(By.xpath("//button[text()='Disable2']")).click();
	}

	@Test
	public void demoWaitExplicitWait() {

		System.out.println("Automation Started");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 25);
		driver.manage().window().setPosition(new Point(2000, 400));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.findElement(By.xpath("//button[text()='Enable']")).click();

		WebElement element = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Disable']")));
		element.click();
		// driver.close();

		boolean visibility = wait
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[text()='Disable2']")));

		Assert.assertEquals(visibility, true);

	}

}
