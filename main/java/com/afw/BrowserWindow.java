package com.afw;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.parent.Base;

public class BrowserWindow extends Base{
	
	@FindBy(xpath="//span[contains(text(),\"Browser Windows\")]")WebElement bw;
	@FindBy(xpath="//button[text()=\"New Tab\"]")WebElement newtab;
	@FindBy(xpath="//button[text()=\"New Window\"]")WebElement newwindow;
	@FindBy(xpath="//button[text()=\"New Window Message\"]")WebElement newmessage;
	
	public void browindow() throws Exception
	{
		scroll();
		bw.click();
		logger17.log(Status.PASS, "Browser Windows tab clicked successfully");
		sleep();
		
		newtab.click();
		logger17.log(Status.PASS, "New Tab opened successfully");
		sleep();
		handles(newtab);
		logger17.log(Status.PASS, "New Tab closed successfully");
		
		newwindow.click();
		logger17.log(Status.PASS, "New Window opened successfully");
		sleep();
		handles(newwindow);
		logger17.log(Status.PASS, "New Window closed successfully");	
		
		newmessage.click();
		logger17.log(Status.PASS, "New Window Message opened successfully");
		sleep();
		handles(newmessage);
		logger17.log(Status.PASS, "New Window Message closed successfully");
		sleep();				
	}
	
}
