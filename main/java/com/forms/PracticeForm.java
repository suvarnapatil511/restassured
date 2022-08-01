package com.forms;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;
import com.parent.Base;

public class PracticeForm extends Base {
	
	//WebElements of practiceform
	@FindBy(xpath="//span[contains(text(),\"Practice Form\")]")WebElement pf;
	@FindBy(xpath="//input[@id=\"firstName\"]")WebElement fn;
	@FindBy(xpath="//input[@id=\"lastName\"]")WebElement ln;	
	@FindBy(xpath="//input[@id=\"userEmail\"]")WebElement emails;	
	@FindBy(xpath="//label[@for=\"gender-radio-1\"]")WebElement gn;
	@FindBy(xpath="//input[@id=\"userNumber\"]")WebElement mbl;
	
	//DOB selection
	@FindBy(xpath="//input[@id=\"dateOfBirthInput\"]")WebElement dob;
	@FindBy(xpath="//select[@class=\"react-datepicker__month-select\"]")WebElement mn;
	@FindBy(xpath="//select[@class=\"react-datepicker__year-select\"]")WebElement yr;
	@FindBy(xpath="//div[text()=\"13\"]")WebElement dt;
	
	@FindBy(xpath="//div[@id=\"subjectsContainer\"]")WebElement sub;
//	@FindBy(xpath="//div[@class=\"subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3\"]")WebElement input;
	@FindBy(xpath="//label[text()=\"Sports\"]")WebElement hob;
	
	@FindBy(xpath="//input[@id='uploadPicture']")WebElement upload;    //for choose file
	
	@FindBy(xpath="//textarea[contains(@id,\"currentAddress\")]")WebElement caddr;
	
	@FindBy(xpath="(//div[@class=\" css-tlfecz-indicatorContainer\"])[1]")WebElement state;
	@FindBy(xpath="//div[text()='Rajasthan']")WebElement raj;
	
	@FindBy(xpath="//div[@class=\" css-1wa3eu0-placeholder\"]")WebElement city;
	@FindBy(xpath="//div[text()='Jaipur']")WebElement jai;
	
	@FindBy(xpath="//button[contains(@id,\"submit\")]")WebElement submit;
	@FindBy(xpath="//button[text()='Close']")WebElement close;
	
	public void practice(String fname,String lname,String email,String Mobile,String cadd) throws Exception
	{
		
		scroll();
		pf.click();
		logger15.log(Status.PASS, "Practice form clicked successfully");
//	    sleep();
		fn.sendKeys(fname);
		logger15.log(Status.PASS, "First name entered successfully");
//		sleep();
		ln.sendKeys(lname);
		logger15.log(Status.PASS, "Last name entered successfully");
//		sleep();
		emails.sendKeys(email);
		logger15.log(Status.PASS, "Email entered successfully");
		gn.click();
		logger15.log(Status.PASS, "Gender clicked successfully");
//		sleep();
		mbl.sendKeys(Mobile);
		logger15.log(Status.PASS, "Mobile number entered successfully");
		sleep();
		
		dob.click();
		logger15.log(Status.PASS, "Date of Birth clicked successfully");
		
		Select s = new Select(mn);
//		s.selectByValue("4");	//month selected by value
		s.selectByIndex(4);		//month selected by index
		logger15.log(Status.PASS, "Month selected successfully");
		sleep();
//		
		Select s1 = new Select(yr);
		s1.selectByVisibleText("1995");		//year selected by visible text
		logger15.log(Status.PASS, "Year selected successfully");
		
		dt.click();
		logger15.log(Status.PASS, "Date clicked successfully");
		sleep();
		scroll();
		
		sleep();
		sub.click();
		logger15.log(Status.PASS, "Subject block clicked successfully");
//		sleep();
//		input.sendKeys("Java Selenium");
		sleep();
		hob.click();
		logger15.log(Status.PASS, "Sports button clicked successfully");
		
		upload.sendKeys("C:\\Users\\user\\Downloads\\MCQ.docx");
		logger15.log(Status.PASS, "Picture uploaded successfully");
		
		caddr.sendKeys(cadd);
		logger15.log(Status.PASS, "Current Address entered successfully");
		sleep();
		scroll();
		
		state.click();
		logger15.log(Status.PASS, "State toggle clicked successfully");
		sleep();
		raj.click();
		logger15.log(Status.PASS, "Rajasthan State selected successfully");
		city.click();
		logger15.log(Status.PASS, "City toggle clicked successfully");
		jai.click();
		logger15.log(Status.PASS, "Jaipur City selected successfully");
		sleep();
		scroll();
		sleep();
		submit.click();
		logger15.log(Status.PASS, "Submit button clicked successfully");
		logger15.log(Status.PASS, "Practice Form submitted successfully");
		scroll();
		sleep();
		close.click();
		sleep();
		
	}
}
