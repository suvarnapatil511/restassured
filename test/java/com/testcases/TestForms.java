package com.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.forms.Forms;
import com.forms.PracticeForm;
import com.parent.Base;
import com.parent.Excell;
import com.screenshots.Utility;

public class TestForms extends Base {
	
//	public static ExtentSparkReporter HTMLreporter = new  ExtentSparkReporter("./Rep/forms");
//    ExtentReports extent = new ExtentReports();
//    public static ExtentTest loggera,loggerb;
//	
////	@BeforeSuite
//	 public void formreport()
//	 {
//			extent.attachReporter(HTMLreporter);
//			loggera=extent.createTest("Forms");
//			loggerb=extent.createTest("Practice");
//	 }
//	
	@BeforeClass 
	  public void launch() throws Exception
	  {
//		 logger();
		 browser_launch();
	  }
	
	@Test(priority = 1)
	public void form()
	{
		Forms f = PageFactory.initElements(driver, Forms.class);
		f.forms();
	}

	@DataProvider
	public Object[][] getExcellData() throws Exception
	{
		Object[][] data = Excell.getTestData("Sheet1");
		return data;
	}
	@Test(dataProvider = "getExcellData",priority = 2)
	public void Records(String fname,String lname,String email,String Mobile,String cadd) throws Exception 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		PracticeForm p=PageFactory.initElements(driver,PracticeForm.class);
		p.practice(fname, lname, email, Mobile,cadd);
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
	
	@AfterClass
	public void endreport()
	{
		extent.flush();
		driver.close();
	}
	
//	 @AfterSuite
	  public void quit()
	  {
		  extent.flush();
		  teardown();
	  }
}





