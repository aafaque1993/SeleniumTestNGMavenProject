package com.qa.testlogic;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 extends BaseClass{
	
	

	
	
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
