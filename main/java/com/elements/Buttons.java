package com.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.parent.Base;

public class Buttons extends Base {

	@FindBy(xpath="//span[contains(text(),\"Buttons\")]")WebElement btn;
	
	@FindBy(xpath="//button[text()=\"Double Click Me\"]")WebElement doub;
	
	@FindBy(xpath="(//button[contains(@class,\"btn btn-primary\")])[2]")WebElement right;
	
	@FindBy(xpath="(//button[contains(@class,\"btn btn-primary\")])[3]")WebElement clk;
	
	public void btn() throws Exception
	{

		sleep();
		btn.click();
		logger7.log(Status.PASS, "Button clicked successfully");
		Actions a = new Actions(driver);
		a.doubleClick(doub).perform();
		logger7.log(Status.PASS, "DoubleClick performed successfully");
		sleep();
		
		Actions a1 = new Actions(driver);
		a1.contextClick(right).perform();
		logger7.log(Status.PASS, "RightClick performed successfully");
		sleep();
		
		clk.click();
		logger7.log(Status.PASS, "DynamicClick performed successfully");
		sleep();
		sleep();

	}
}
