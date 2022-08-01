package com.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.parent.Base;

public class Elements extends Base {

	@FindBy(xpath="//a[@id=\"close-fixedban\"]")WebElement adv;
	
	public void elements() throws Exception 
	{
		//Elements
		scroll();
		driver.findElement(By.xpath("(//div[@class=\"card-up\"])[1]")).click();
		logger2.log(Status.PASS, "Elements clicked successfully");

		adv.click();
		Thread.sleep(2000);
		
	}
	
}
