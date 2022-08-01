package com.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.parent.Base;

public class Links extends Base {

	@FindBy(xpath="//span[contains(text(),\"Links\")]")WebElement link;	
	
	@FindBy(xpath="(//a[text()=\"Home\"])[1]")WebElement hm;
	@FindBy(xpath="(//a[text()=\"Home\"])[2]")WebElement dyn;	
	
	@FindBy(xpath="//a[contains(@id,\"created\")]")WebElement created;
	@FindBy(xpath="//a[contains(@id,\"no-content\")]")WebElement nocon;
	@FindBy(xpath="//a[contains(@id,\"moved\")]")WebElement moved;
	@FindBy(xpath="//a[contains(@id,\"bad-request\")]")WebElement bdrqst;
	@FindBy(xpath="//a[contains(@id,\"unauthorized\")]")WebElement unautho;
	@FindBy(xpath="//a[contains(@id,\"forbidden\")]")WebElement forbid;
	@FindBy(xpath="//a[contains(@id,\"invalid-url\")]")WebElement ntfnd;

	
	public void link() throws Exception
	{
		scroll();
		link.click();
		logger8.log(Status.PASS, "Links clicked successfully");
		sleep();
		
		hm.click();
		logger8.log(Status.PASS, "Home Tab opened successfully");
		sleep();
		handles(hm);
		logger8.log(Status.PASS, "Home Tab closed successfully");
		
		dyn.click();
		logger8.log(Status.PASS, "Dynamic Home Tab opened successfully");
		sleep();
		handles(dyn);
		logger8.log(Status.PASS, "Dynamic Home Tab closed successfully");
		
		created.click();
		logger8.log(Status.PASS, "Created clicked successfully");
		nocon.click();
		logger8.log(Status.PASS, "No Content clicked successfully");
		scroll();
		moved.click();
		logger8.log(Status.PASS, "Move clicked successfully");
		scroll();
		bdrqst.click();
		logger8.log(Status.PASS, "Bad Request clicked successfully");
		unautho.click();
		logger8.log(Status.PASS, "Unauthorized clicked successfully");
		forbid.click();
		logger8.log(Status.PASS, "Forbidden clicked successfully");
		ntfnd.click();
		logger8.log(Status.PASS, "Not Found clicked successfully");
		sleep();
	}
}



