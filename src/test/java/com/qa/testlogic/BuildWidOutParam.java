package com.qa.testlogic;


import org.testng.annotations.Test;

import com.qa.base.BaseClass;

public class BuildWidOutParam  extends BaseClass{
	
	
	@Test
	public void setup() {
		BrowserInit("Chrome", "UAT05");
	}

}
