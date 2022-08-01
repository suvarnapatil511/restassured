package com.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.parent.Base;

public class Dynamic extends Base{

	
	@FindBy(xpath="//span[contains(text(),\"Dynamic Properties\")]")WebElement dp;
	@FindBy(xpath="//button[@class=\"mt-4 text-danger btn btn-primary\"]")WebElement color;
	@FindBy(xpath="//img[@title=\"Ad.Plus Advertising\"]")WebElement advt;

	public void dyn() throws Exception
	{
		scroll();
		scroll();
		dp.click();
		advt.click();
		logger11.log(Status.PASS, "Dynamic Properties clicked successfully");
		color.click();
		logger11.log(Status.PASS, "Color changed successfully");
		sleep();
		driver.get("https://demoqa.com/elements");
		logger11.log(Status.PASS, "Navigate back worked successfully");
		sleep();
	}
}
