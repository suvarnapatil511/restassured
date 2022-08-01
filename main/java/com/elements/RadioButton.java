package com.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.parent.Base;

public class RadioButton extends Base{

	@FindBy(xpath="(//li[contains(@id,\"item-2\")])[1]")WebElement rd;
	@FindBy(xpath="//label[text()=\"Ye\"]")WebElement ys;
		
	public void radiobtn() throws Exception
	{
		scroll();
		sleep();
		rd.click();
		logger5.log(Status.PASS, "Radio button clicked successfully");
		sleep();
		ys.click();
//		logger5.log(Status.FAIL, "Yes radiobuttin unsuccessed");
		sleep();
	}
}

