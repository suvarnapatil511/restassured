package com.afw;

import javax.swing.Scrollable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.parent.Base;

public class ModalDialogs extends Base{

	@FindBy(xpath="//span[text()=\"Modal Dialogs\"]")WebElement modalclk;
	@FindBy(xpath="//button[contains(@id,\"showSmallModal\")]")WebElement small;
	@FindBy(xpath="//button[contains(@id,\"closeSmallModal\")]")WebElement smallclose;
	@FindBy(xpath="//button[@id=\"showLargeModal\"]")WebElement large;
	@FindBy(xpath="//button[contains(@id,\"closeLargeModal\")]")WebElement largeclose;
	
	public void modals() throws Exception
	{
		scroll();
		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(modalclk));
		modalclk.click();
		logger21.log(Status.PASS, "Modal Dialogs Tab clicked successfully");
		sleep();
		small.click();
		logger21.log(Status.PASS, "Small modal clicked successfully");
		sleep();
		smallclose.click();
		logger21.log(Status.PASS, "Small modal closed successfully");
		sleep();
		
		large.click();
		logger21.log(Status.PASS, "Large modal clicked successfully");
		sleep();
		largeclose.click();
		logger21.log(Status.PASS, "Large modal closed successfully");
		sleep();
		
	}
}
