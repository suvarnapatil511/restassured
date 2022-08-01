package com.afw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.parent.Base;

import jdk.jfr.internal.Logger;

public class Frames extends Base{

	@FindBy(xpath="//span[text()=\"Frames\"]")WebElement frames;
	@FindBy(xpath="//iframe[@id=\"frame1\"]")WebElement frame1;
	@FindBy(xpath="//iframe[@id=\"frame2\"]")WebElement frame2;
	@FindBy(xpath="//h1[text()='This is a sample page']")WebElement childtext;
	
	public void frame() throws Exception
	{
		scroll();
		frames.click();
		logger19.log(Status.PASS,"Frames Tab clicked successfully");
		
//		new WebDriverWait(driver,10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id=\"frame2\"]")));
		
		driver.switchTo().frame(frame1);
		logger19.log(Status.PASS,"Entered in parent iframe field");
		String text1 = driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
		System.out.println(text1);	
		logger19.log(Status.PASS, "Took the title of parent frame");
		sleep();
		driver.switchTo().defaultContent();
		
		scroll();
		driver.switchTo().frame(frame2);
		logger19.log(Status.PASS, "Entered in child frame field");
		String text2 = childtext.getText();
		System.out.println(text2);
		logger19.log(Status.PASS, "Took the title of child frame");
		
		driver.switchTo().defaultContent();
		logger19.log(Status.PASS, "Get back to default content successfully");
		
	}
}
