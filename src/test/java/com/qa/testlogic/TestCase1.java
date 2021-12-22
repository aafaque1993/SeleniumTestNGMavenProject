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

public class TestCase1 {
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
		WebDriverWait wait = new WebDriverWait(driver,30);
		boolean flag=false;
		//waits until element is click able
		WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(element));
		List<WebElement> ll=null;
		ele.click();
		// wait where true when you want the element to be select and false when u want to un select
		
		flag = wait.until(ExpectedConditions.elementSelectionStateToBe(element, true));//web element 
		
		flag=wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath(""), false));//locator

		//returns elementSelectionStateToBe(locator/web element, true)
		flag=wait.until(ExpectedConditions.elementToBeSelected(By.xpath(""))); 
		
		flag=wait.until(ExpectedConditions.elementToBeSelected(element));
		
		//Switches to frames based on locator , web element , index and Name its an overloaded methods
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("")));
		
		//It checks the is the expectation for checking that an element is present on the DOM of a page. 
		//This does not necessarily mean that the element is visible 
		ele=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));//returns sub element

		ll=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("")));//will return list of web element
		
		ele=wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(By.xpath(""), By.xpath("")));//returns sub element
		
		ele=wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(ele, By.xpath("")));//returns sub element
		
		ll=wait.until(ExpectedConditions.presenceOfNestedElementsLocatedBy(By.xpath(""), By.xpath("")));//returns list of sub element
		
		//it is the expectation for checking that an element is present on the DOM of a page and visible. 
		//Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
		
		ele=wait.until(ExpectedConditions.visibilityOf(ele));//return same web element when visible
		
		ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))); //return  web element when visible using locator parameter
		
		ll=wait.until(ExpectedConditions.visibilityOfAllElements(element)); //return same list web element when visible
		
		ll=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));//return same list web element when visible using parameter as locator

		//Returns list of nested web elements when visible using parameter as locator locator or element locator
				
		ll=wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(By.xpath(""), By.xpath("")));
				
		ll=wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(ele, By.xpath("")));
		
		//it is the expectation for checking that an element is Invisible. 
		
		// All return true if the element is invisible
		wait.until(ExpectedConditions.invisibilityOf(ele));
		
		wait.until(ExpectedConditions.invisibilityOfAllElements(element));
		
		wait.until(ExpectedConditions.invisibilityOfAllElements(element));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
		
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(""), ""));
		
		//return true when text present in the element is present 
		
		wait.until(ExpectedConditions.textToBePresentInElement(element, "Total"));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='timeLeft']"), "Time left: 7 seconds"));
				
		
		//waits until alert is visible then returns the alert
		Alert alert22 = driver.switchTo().alert();
		Alert alert=wait.until(ExpectedConditions.alertIsPresent()) ;		
		if(wait.until(ExpectedConditions.alertIsPresent()) != null) {};
		alert.accept();
		alert.dismiss();
		alert.sendKeys("UN");
		alert.getText();
	 
		
		
	}

}
