package com.testcases;

import java.awt.Button;
import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.elements.BrokenLinks;
import com.elements.Buttons;
import com.elements.CheckBox;
import com.elements.Dynamic;
import com.elements.Elements;
import com.elements.Links;
import com.elements.RadioButton;
import com.elements.TextBox;
import com.elements.WebTables;
import com.parent.Base;
import com.screenshots.Utility;

public class TestElements extends Base {
	
  @BeforeSuite
  public void launch() throws Exception
  {
	  	logger();
	  	browser_launch();
  }
  
  @Test(priority = 1)
  public void element() throws Exception
  {
	 logger2.log(Status.PASS, "Elements tab button clicked successfully");
	 Elements e = PageFactory.initElements(driver,Elements.class);   //action
	 e.elements(); 
  }
  @Test(priority = 2)
  public void text() throws Exception
  {
	 TextBox t = PageFactory.initElements(driver, TextBox.class);
	 t.textbox();
  }
  @Test(priority = 3)
  public void check() throws Exception
  {
	  CheckBox c = PageFactory.initElements(driver, CheckBox.class);
	  c.checkbox();
  }
  
  @Test(priority = 4)
  public void radio() throws Exception
  {
	  RadioButton r = PageFactory.initElements(driver, RadioButton.class);
	  r.radiobtn();	  
  }
  @Test(priority = 5)
  public void webtables() throws Exception
  {
	  WebTables w = PageFactory.initElements(driver, WebTables.class);
	  w.web();
  }
  @Test(priority = 6)
  public void button() throws Exception
  {
	  Buttons b = PageFactory.initElements(driver, Buttons.class);
	  b.btn();
  }
  @Test(priority = 7)
  public void links() throws Exception
  {
	  Links l = PageFactory.initElements(driver, Links.class);
	  l.link();
  }
  @Test(priority = 8)
  public void broken() throws Exception
  {
	  BrokenLinks b = PageFactory.initElements(driver, BrokenLinks.class);
	  b.brklinks();
  }
  @Test(priority = 9)
  public void dynprop() throws Exception
  {
	  Dynamic d = PageFactory.initElements(driver, Dynamic.class);
	  d.dyn();
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
  
//  @AfterSuite
  public void quit()
  {
	  extent.flush();
	  teardown();
  }
  
}
