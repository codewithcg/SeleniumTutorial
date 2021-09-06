package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Automation Started");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(2000, 400));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Controls")).click();

		driver.findElement(By.xpath("//*[@id='input-example']/button")).click();
		Thread.sleep(5000);
		WebElement textele = driver.findElement(By.xpath("//*[@id='input-example']/input"));

		boolean bl = textele.isEnabled();

		if (bl) {
			System.out.println("The element is Enabled ");
		}

		else {
			System.out.println("The element is Disabled ");
		}

	}

}
