package com.widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.parent.Base;

public class Widgets extends Base {
	
	@FindBy(xpath="//a[@id=\"close-fixedban\"]")WebElement adv;
	@FindBy(xpath="//div[text()=\"Widgets\"]")WebElement widget;
	
	
	public void widget() throws Exception
	{
		scroll();
		adv.click();
		sleep();
		widget.click();
		logger22.log(Status.PASS, "Widgets Tab clicked successfully");
	}
}
