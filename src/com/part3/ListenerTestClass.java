package com.part3;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersDemo.class)
public class ListenerTestClass {

	@Test(dataProvider = "getData")
	public void testCase1(String username, String password) {
		System.out.println(username + " " + password);
	}
	
	@Test(priority = 3)
	public void testCase2() {
		System.out.println("Some method");
	}

	@Test(priority = 5)
	public void testCase3() {
		Assert.assertTrue(false);
	}

	@DataProvider
	public Object[][] getData() {
		Object objarr[][] = new Object[2][2];
		objarr[0][0] = "admin";
		objarr[0][1] = "manager";
		objarr[1][0] = "admin1";
		objarr[1][1] = "manager1";
		return objarr;
	}

}
