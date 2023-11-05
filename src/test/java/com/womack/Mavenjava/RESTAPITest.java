package com.womack.Mavenjava;

import org.testng.annotations.Test;

public class RESTAPITest {

	@Test(groups= {"smoke"})
	public void postJira() {
		System.out.println("postJira");
		System.out.println("postJira2");
		System.out.println("postJira3");
	}
	
	@Test(groups= {"smoke"})
	public void deleteJira() {
		System.out.println("deleteJira");
		System.out.println("deleteJira2");
	}
	
	@Test 
	public void deleteTwitter() {
		System.out.println("deleteTwitter");
	}
	
	@Test 
	public void addTwitterPost() {
		System.out.println("PostTwitter");
	}
	
	@Test 
	public void featureMike() {
		System.out.println("feature/mike");
	}
	
}
