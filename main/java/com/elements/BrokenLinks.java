package com.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.parent.Base;

public class BrokenLinks extends Base{

		//Broken Links-Images
		@FindBy(xpath="//span[text()=\"Broken Links - Images\"]")WebElement brk;
		@FindBy(xpath="//a[text()=\"Click Here for Valid Link\"]")WebElement vl;
		@FindBy(xpath="//img[@title=\"Ad.Plus Advertising\"]")WebElement advt;
		
		@FindBy(xpath="//a[text()=\"Click Here for Broken Link\"]")WebElement bl;

		public void brklinks() throws Exception
		{
			scroll();
			brk.click();
			sleep();
			logger9.log(Status.PASS, "Broken Links-Images clicked successfully");
			scroll();
			vl.click();
			sleep();
			advt.click();
			sleep();
			logger9.log(Status.PASS, "Valid Link clicked successfully");
			driver.navigate().back();
			logger9.log(Status.PASS, "Navigate back worked successfully");
			advt.click();
			sleep();
			scroll();
			bl.click();
			sleep();
			logger9.log(Status.PASS, "Broken Link clicked successfully");
			driver.navigate().back();
			logger9.log(Status.PASS, "Navigate back worked successfully");
			sleep();
		}
		
}
