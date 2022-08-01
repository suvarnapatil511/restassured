package com.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.afw.Alert;
import com.afw.AlertTab;
import com.afw.BrowserWindow;
import com.afw.Frames;
import com.afw.ModalDialogs;
import com.afw.NestedFrames;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.parent.Base;
import com.screenshots.Utility;

public class TestAlert extends Base {

//	@BeforeSuite
	@BeforeClass
	public void launch() throws IOException, InterruptedException
	{
//		logger();
		browser_launch();
	}
	
	@Test(priority = 1)
	public void alert() throws Exception
	{
		Alert a = PageFactory.initElements(driver, Alert.class);
		a.alerts();
	}
	
	@Test(priority = 2)
	public void browserwindow() throws Exception
	{
		BrowserWindow b = PageFactory.initElements(driver, BrowserWindow.class);
		b.browindow();
	}
	
	@Test(priority = 3)
	public void alert_tab() throws Exception
	{
		AlertTab a = PageFactory.initElements(driver, AlertTab.class);
		a.alrtab();
	}
	
	@Test(priority = 4)
	public void frames() throws Exception
	{
		Frames f = PageFactory.initElements(driver, Frames.class);
		f.frame();
	}
		

	@Test(priority = 5)
	public void nested() throws Exception
	{
		NestedFrames n = PageFactory.initElements(driver, NestedFrames.class);
		n.nestedframes();
	}
	
	@Test(priority = 6)
	public void modal() throws Exception
	{
		ModalDialogs m = PageFactory.initElements(driver, ModalDialogs.class);
		m.modals();
	}
	
	@AfterMethod
	public void Screenshot(ITestResult result) throws Exception
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			try {
					
					if(ITestResult.FAILURE==result.getStatus())
					{
						String temp=Utility.ss(driver, result.getName());
				

						logger13.fail("Testcase name : "+ result.getName());
						logger13.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());

					}
			  	 }
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
			  
		}
			
	 }
		
	@AfterSuite
	public void quit()
	{
		extent.flush();
		teardown();
	}
}
