package com.widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.parent.Base;

public class Accordian extends Base{

	@FindBy(xpath="//span[text()=\"Accordian\"]")WebElement accordian;
	@FindBy(xpath="(//div[@class=\"card-header\"])[1]")WebElement acc1;
	@FindBy(xpath="(//div[@class=\"card-header\"])[2]")WebElement acc2;
	@FindBy(xpath="(//div[@class=\"card-header\"])[3]")WebElement acc3;
	
	public void accordian() throws Exception
	{
		accordian.click();
		sleep();
		acc1.click();
		sleep();
		acc2.click();
		sleep();
		acc2.click();
		sleep();
		acc3.click();
		sleep();
		acc3.click();
		scroll();
	}
}




