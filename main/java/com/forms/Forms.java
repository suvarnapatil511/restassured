package com.forms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.parent.Base;

public class Forms extends Base{

	@FindBy(xpath="//a[@id=\"close-fixedban\"]")WebElement adv;
	@FindBy(xpath="(//div[@class=\"card-up\"])[2]")WebElement forms;
	
	public void forms()
	{
		adv.click();
		scroll();
		forms.click();
		logger14.log(Status.PASS, "Forms tab clicked successfully");
		
	}
	
}
