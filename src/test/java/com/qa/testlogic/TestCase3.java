package com.qa.testlogic;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase3 {
	
	
	@FindBy(xpath = "//sample")
	private WebElement element;

	@BeforeMethod
	public void startTestcase() {

	}

	@Test
	public void startCase1() {
		System.out.println("Case 7");

	}

	@Test
	public static void startCase2() {
		System.out.println("Case 8");

	}

	@Test
	public void startCase3() {
		System.out.println("Case 9");

	}

	@AfterMethod
	public void endTestcase() {
		
	}

}
