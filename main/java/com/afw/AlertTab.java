package com.afw;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.parent.Base;

public class AlertTab extends Base{
	
	public void accept()
	{
		driver.switchTo().alert().accept();
	}
	public void dismiss()
	{
		driver.switchTo( ).alert( ).dismiss();
	}
	public void prompt()
	{
		driver.switchTo().alert().sendKeys("Sagar");
	}

	@FindBy(xpath="//span[text()=\"Alerts\"]")WebElement alt;
	@FindBy(xpath="//button[contains(@id,\"alertButton\")]")WebElement altbtn;
	@FindBy(xpath="//button[contains(@id,\"timerAlertButton\")]")WebElement timeclk;
	@FindBy(xpath="//button[@id=\"confirmButton\"]")WebElement confirmbtn;
	@FindBy(xpath="//button[@id=\"promtButton\"]")WebElement promptbtn;
	
	public void alrtab() throws Exception
	{
		scroll();
		alt.click();
		logger18.log(Status.PASS, "Alerts tab clicked successfully");
		altbtn.click();
		logger18.log(Status.PASS, "Alert button clicked successfully");
		sleep();
		accept();
		logger18.log(Status.PASS, "Alert prompt clicked successfully");
		
		timeclk.click();
		logger18.log(Status.PASS, "TimeAlert button clicked successfully");
		sleep();
		sleep();
		sleep();
		accept();
		logger18.log(Status.PASS, "TimeAlert prompt clicked successfully");
		
		confirmbtn.click();
		logger18.log(Status.PASS, "Confirm Button clicked successfully");
		sleep();
		dismiss();
		logger18.log(Status.PASS, "Dismiss prompt clicked successfully");
		sleep();
		
		promptbtn.click();
		logger18.log(Status.PASS, "Prompt button clicked successfully");
		sleep();
		prompt();
		logger18.log(Status.PASS, "Prompt alert clicked successfully");
		sleep();
		accept();
		logger18.log(Status.PASS, "Prompt clicked successfully");
		sleep();
		
	}
}


