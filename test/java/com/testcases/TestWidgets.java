package com.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.parent.Base;
import com.widgets.Accordian;
import com.widgets.AutoComplete;
import com.widgets.Widgets;

public class TestWidgets extends Base{

//	@BeforeClass
	@BeforeSuite
	public void launch() throws IOException, InterruptedException
	{
//		logger();
		browser_launch();
	}
	
	@Test(priority = 1)
	public void widget() throws Exception
	{
		Widgets w = PageFactory.initElements(driver, Widgets.class);
		w.widget();
	}
	@Test(priority = 2)
	public void accordian() throws Exception
	{
		Accordian a = PageFactory.initElements(driver, Accordian.class);
		a.accordian();
	}
	
	public void autocomplete() throws Exception
	{
		AutoComplete ac = PageFactory.initElements(driver, AutoComplete.class);
		ac.auto();
	}
	
	
	
	
	
	
	
	
}




