package com.selenium.framework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WindowHandles extends BaseSeleniumTest {

	@Test
	public void handleWindow() {

		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.findElement(By.xpath("//button[text()='Try it1']")).click();
		driver.findElement(By.xpath("//button[text()='Try it2']")).click();
		driver.findElement(By.xpath("//button[text()='Try it3']")).click();

		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();

		Iterator<String> iterator = allWindows.iterator();

		while (iterator.hasNext()) {

			String currentWindow = iterator.next();

			if (!currentWindow.equals(parentWindow)) {

				driver.switchTo().window(currentWindow);
				String title = driver.getTitle();
				System.out.println("Window Handle Id: " + currentWindow + " ==> Title is : " + title);
				driver.close();
			}

		}

		driver.switchTo().window(parentWindow);
		System.out.println("Parent Title is : " + driver.getTitle());

	}

}
