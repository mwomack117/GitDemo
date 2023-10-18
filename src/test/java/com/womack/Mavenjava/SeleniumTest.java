package com.womack.Mavenjava;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	//testng xml file from Maven
	//how to execute all test cases from Test folder - mvn test
	
	@Test
	public void browserAutomation() {
		System.out.println("browserAutomation");
		System.out.println("Web Automation");
	}

	@Test
	public void elementsUI() {
		System.out.println("elementsUI");
	}

}
