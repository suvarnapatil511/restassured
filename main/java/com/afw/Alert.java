package com.afw;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.parent.Base;

public class Alert extends Base {
	
	@FindBy(xpath="//a[@id=\"close-fixedban\"]")WebElement adv;
	@FindBy(xpath="(//div[@class=\"card-up\"])[3]")WebElement alt;
	
	public void alerts() throws Exception
	{
		scroll();
		adv.click();
		sleep();
		alt.click();
		logger16.log(Status.PASS, "Alerts,Frames and Windows clicked successfully");
		
	}
}
