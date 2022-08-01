package com.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.parent.Base;

public class WebTables extends Base {

	@FindBy(xpath="//span[contains(text(),\"Web Tables\")]")WebElement wt;
	@FindBy(xpath="//button[text()=\"Add\"]")WebElement add;
	@FindBy(xpath="//input[contains(@id,\"firstName\")]")WebElement fn;
	@FindBy(xpath="//input[contains(@id,\"lastName\")]")WebElement ln;
	@FindBy(xpath="//input[contains(@id,\"Email\")]")WebElement em;
	@FindBy(xpath="//input[contains(@id,\"age\")]")WebElement age;
	@FindBy(xpath="//input[contains(@id,\"salary\")]")WebElement sal;
	@FindBy(xpath="//input[contains(@id,\"department\")]")WebElement dep;
	@FindBy(xpath="//button[contains(@id,\"submit\")]")WebElement submitbtn;
	@FindBy(xpath="//input[contains(@id,\"searchBox\")]")WebElement search;
	@FindBy(xpath="//span[contains(@id,\"basic-addon2\")]")WebElement tap;
	@FindBy(xpath="//span[contains(@id,\"edit-record-4\")]")WebElement edit;
	@FindBy(xpath="//input[contains(@id,\"salary\")]")WebElement saledit;
	@FindBy(xpath="//button[contains(@id,\"submit\")]")WebElement submitedit;
	@FindBy(xpath="//span[contains(@id,\"delete-record-4\")]")WebElement del;

	
	public void web() throws Exception
	{
		scroll();
		sleep();
		wt.click();
		logger6.log(Status.PASS, "Web Tables clicked successfully");
		add.click();
		logger6.log(Status.PASS, "Add button clicked successfully");
		fn.sendKeys("sagar");
		logger6.log(Status.PASS, "Firstname entered successfully");
		ln.sendKeys("gone");
		logger6.log(Status.PASS, "Lastname entered successfully");
		em.sendKeys("sagar@123.com");
		logger6.log(Status.PASS, "Email entered successfully");
		age.sendKeys("26");
		logger6.log(Status.PASS, "Age entered successfully");
		sal.sendKeys("18000");
		logger6.log(Status.PASS, "Salary entered successfully");
		dep.sendKeys("Automation");
		logger6.log(Status.PASS, "Department entered successfully");
		submitbtn.click();
		logger6.log(Status.PASS, "Submit button worked successfully");
		sleep();
		search.sendKeys("sagar");
		logger6.log(Status.PASS, "Search box worked successfully");
		tap.click();
		logger6.log(Status.PASS, "Search symbol tap worked successfully");
//		sleep();
		edit.click();
		logger6.log(Status.PASS, "Edit clicked successfully");
		saledit.clear();
		logger6.log(Status.PASS, "Salary box clicked successfully");
		saledit.sendKeys("20000");
		logger6.log(Status.PASS, "Salary editin worked successfully");
		submitedit.click();
		logger6.log(Status.PASS, "Submit button worked successfully");
//		sleep();
		del.click();
		logger6.log(Status.PASS, "Delete Button worked successfully");
	
	}
}


