package com.qa.testlogic;

import org.testng.annotations.Test;

import com.qa.base.BaseClass;

public class Priority extends BaseClass {

	@Test(priority = 1, dependsOnMethods = "test2")
	public void test1() {
		System.out.println("Test 1");
	}

	@Test(priority = 2)
	public void test2() {
		System.out.println("Test 2");
	}

}
