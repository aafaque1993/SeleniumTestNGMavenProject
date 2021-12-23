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
import org.testng.annotations.Test;

public class TestCase2 {
	
	
	
	
	
	@FindBy(xpath = "//sample")
	private WebElement element;

	WebDriver driver = new ChromeDriver();

	@Test
	public void startCase1() {
		System.out.println("Case 1");

	}

	@Test
	public void startCase2() {
		System.out.println("Case 2");

	}

	@Test
	public void startCase3() {
		System.out.println("Case 3");
		
		driver.quit();
		
	}

}
