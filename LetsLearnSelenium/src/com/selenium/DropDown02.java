package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown02 {

	public static void main(String[] args) {

		System.out.println("Automation Started");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(2000, 400));
		driver.manage().window().maximize();
		driver.get("C:\\Users\\chandangupta\\Desktop\\Test.html");

		WebElement ele = driver.findElement(By.xpath("//*[@id='carsmultiple']"));
		Select dd = new Select(ele);
		boolean bl = dd.isMultiple();

		if (bl) {

			dd.selectByIndex(2);
			dd.selectByVisibleText("Saab");
			dd.selectByValue("lakshmi");

			// dd.deselectByVisibleText("Audi");
			// dd.deselectByValue("bindhu");
			// dd.deselectAll();

			List<WebElement> web = dd.getAllSelectedOptions();

			for (WebElement st : web) {
				System.out.println(st.getText());
			}

			System.out.println("==================");

			List<WebElement> web2 = dd.getOptions();

			for (WebElement st : web2) {
				System.out.println(st.getText());
			}

		}

	}

}
