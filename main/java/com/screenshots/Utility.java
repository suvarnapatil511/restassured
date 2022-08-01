package com.screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;
import com.google.common.io.Files;
import com.parent.Base;

public class Utility extends Base{


		public static String ss(WebDriver driver,String s) throws Exception
		{
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File source=ts.getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir")+"/SS/"+s+".png";
			File destination= new File(path);
			
			
			try
			{
			FileUtils.copyFile(source, destination);
			}
			catch (Exception e)
			{
				
			}
			return path;
		}

		
		
}
