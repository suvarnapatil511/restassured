package com.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.parent.Base;

	public class TextBox extends Base{

	@FindBy(xpath="//span[contains(text(),\"Text Box\")]")WebElement textbtn;	
	@FindBy(xpath="//input[@id=\"userName\"]")WebElement fname;	
	@FindBy(xpath="//input[@id=\"userEmail\"]")WebElement email;	
	@FindBy(xpath="//textarea[@id=\"currentAddress\"]")WebElement cadd;	
	@FindBy(xpath="//textarea[@id=\"permanentAddress\"]")WebElement padd;	
	@FindBy(xpath="//button[@id=\"submit\"]")WebElement submit;
	
	public void textbox() throws Exception
	{
		textbtn.click();
		logger3.log(Status.PASS, "TextBox button clicked successfully");
		sleep();		
		fname.sendKeys("sagar");	
		logger3.log(Status.PASS, "First name entered successfully");
		email.sendKeys("sagar@123.com");	
		logger3.log(Status.PASS, "Email entered successfully");
		scroll();		
		cadd.sendKeys("Lower Parel,Mumbai");
		logger3.log(Status.PASS, "Current address entered successfully");
		padd.sendKeys("Worli,Mumbai");	
		logger3.log(Status.PASS, "Permanent address entered successfully");
		submit.click();	
		logger3.log(Status.PASS, "Submit button clicked successfully");
		sleep();
		
	}
}
