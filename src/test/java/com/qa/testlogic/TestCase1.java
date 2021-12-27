package com.qa.testlogic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;


public class TestCase1 extends BaseClass {

	@FindBy(xpath = "//sample")
	private WebElement element;

	@Parameters({ "browser", "url" })
	@BeforeMethod
	public void startTestcase(String browser, String url) {
		BrowserInit(browser, url);
	}

	@Parameters("txnref")
	@Test
	public void startCase1(String txnref) {
		System.out.println("Case 1");
		System.out.println("Transaction Reference " + txnref);
	}

	@Test
	public static void startCase2() {
		System.out.println("Case 2");

	}

	@Test
	public void startCase3() {
		System.out.println("Case 3");

	}

	@AfterMethod
	public void endTestcase() {
		driver.quit();
	}

}
