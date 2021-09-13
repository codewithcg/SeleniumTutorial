package com.selenium.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {

	@Test
	public void f() {
		System.out.println("I am in Test method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am in Before Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am in Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am in After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am in Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am in After Class");
	}

}
