package com.bank.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;

import com.bank.utility.TestUtils;
import com.bank.base.*;


public class Listerners implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
	test=rep.startTest(arg0.getName().toUpperCase());
	
		if(!TestUtils.isTestRunnable(arg0.getName(), excel)) {
			throw new SkipException("Skipping the test "+arg0.getName().toUpperCase()+" as the Run mode is NO");
		}
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		
	}

}
