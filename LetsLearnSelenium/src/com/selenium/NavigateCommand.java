package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {

	public static void main(String[] args) {

		System.out.println("Automation Started");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		// driver.navigate().to("https://the-internet.herokuapp.com/");
		// driver.navigate().back();
		// driver.navigate().forward();
		// driver.navigate().refresh();

		driver.findElement(By.linkText("Form Authentication")).click();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//*[@id='login']/button/i")).click();
		String text = driver.findElement(By.xpath("//*[@id='flash']")).getText();
		// System.out.println("Message is : " + text);

		if (text.contains("You logged")) {
			System.out.println("Hurray I am logged in");
		}

		else {
			System.out.println("Gosh..I  couldn't login");
		}

	}

}
