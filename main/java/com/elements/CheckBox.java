package com.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.parent.Base;

public class CheckBox extends Base {

	@FindBy(xpath="//span[contains(text(),\"Check Box\")]")WebElement chkbox;
	@FindBy(xpath="//button[@aria-label=\"Toggle\"]")WebElement tgl1;
	@FindBy(xpath="(//span[@class=\"rct-checkbox\"])[1]")WebElement tgl2;

	public void checkbox() throws Exception
	{
		chkbox.click();
		sleep();
		logger4.log(Status.PASS, "CheckBox button clicked successfully");
		tgl1.click();
		logger4.log(Status.PASS, "Toggle clicked successfully");
		tgl2.click();
		logger4.log(Status.PASS, "Home toggle clicked successfully");
		sleep();
	}
}


