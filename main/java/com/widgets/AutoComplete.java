package com.widgets;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.parent.Base;

public class AutoComplete extends Base{

	@FindBy(xpath="//span[text()=\"Auto Complete\"]")WebElement auto;
	@FindBy(xpath="(//div[@class=\"auto-complete__control css-yk16xz-control\"])[1]")WebElement mulcolor;
	@FindBy(xpath="(//div[@class=\"auto-complete__control css-yk16xz-control\"])[2]")WebElement singlecolor;
	
	public void auto() throws Exception
	{
		scroll();
		auto.click();
		mulcolor.click();
		mulcolor.sendKeys("Red");
		mulcolor.sendKeys("Blue");
		sleep();
		singlecolor.click();
		singlecolor.sendKeys("Indigo");
		scroll();
		
		
		
		
	}
	
}
