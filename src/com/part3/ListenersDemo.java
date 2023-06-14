package com.part3;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" passed Successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getName();
		System.out.println(name+" Test Failed");
		
	}
	
	

}
