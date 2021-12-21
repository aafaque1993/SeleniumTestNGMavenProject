package com.qa.testlogic;



import org.testng.annotations.Test;

import com.qa.base.BaseClass;

public class TestCase1 extends BaseClass {

	

	public TestCase1() {
		log.info("Test Case 1 Started");
	}
	
	
	
	@Test
	public void startCase() {
		
		log.info("Starting................");
	}
	
}
