package com.parent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.util.SSCellRange;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static ExtentSparkReporter HTMLreporter = new  ExtentSparkReporter("./Rep/toolsqa");
    public static ExtentReports extent = new ExtentReports();
    public static ExtentTest logger1,logger2,logger3,logger4,logger5,logger6,
    logger7,logger8,logger9,logger10,logger11,logger12,logger13,
    
    //Forms logger 
    logger14,logger15,
    //Alerts,Frame and Windows logger
    logger16,logger17,logger18,logger19,logger20,
    logger21,
    //
    logger22,logger23,logger24,logger25,logger26,logger27,logger28,logger29,logger30,logger31;
	
	public static WebDriver driver;	
	public static Properties prop;
	
//	static
	
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Browser Jar Files\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver" , "C:\\Selenium Browser Jar Files\\geckodriver.exe");
//	}
	
	public void logger()
	{
		extent.attachReporter(HTMLreporter);
		logger1=extent.createTest("Browser");
		logger2=extent.createTest("Elements");
		logger3=extent.createTest("TextBox");
		logger4=extent.createTest("CheckBox");
		logger5=extent.createTest("Radio Buttons");
		logger6=extent.createTest("Web Tables");
		logger7=extent.createTest("Buttons");
		logger8=extent.createTest("Links");
		logger9=extent.createTest("Broken Links-Images");
		logger10=extent.createTest("Upload and Download");
		logger11=extent.createTest("Dynamic Properties");
		logger12=extent.createTest("Browser closing");
		logger13=extent.createTest("Failed tests");
		
		logger14=extent.createTest("Forms");
		logger15=extent.createTest("Practice Form");
		
		logger16=extent.createTest("Alerts,Frames and Windows");
		logger17=extent.createTest("Browser Windows Tab");
		logger18=extent.createTest("Alerts Tab");
		logger19=extent.createTest("Frames Tab");
		logger20=extent.createTest("Nested Frames Tab");
		logger21=extent.createTest("Modal Dialogs Tab");
		
		logger22=extent.createTest("Widgets Tab");
		logger23=extent.createTest("Accordian Tab");
		logger24=extent.createTest("Auto Complete Tab");
		logger25=extent.createTest("Date Picker Tab");
		logger26=extent.createTest("Slider Tab");
		logger27=extent.createTest("Progress Bar Tab");
		logger28=extent.createTest("Tabs Tab");
		logger29=extent.createTest("Tool Tips Tab");
		logger30=extent.createTest("Menu tab");
		logger31=extent.createTest("Select Menu Tab");
		
		
	}
	
	public static String base(String data) throws IOException 
    {
		FileInputStream i=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
	    Properties p = new  Properties();
	    p.load(i);    
	    String w =p.getProperty(data);//key
	    return w;
    }
	
	public void browser_launch() throws IOException, InterruptedException
	{
		if(base("browser").equalsIgnoreCase("chrome"))
		{
			
//			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Browser Jar Files\\chromedriver.exe");
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		    System.out.println("Chrome Browser is Opened");
		}
		else 
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");		
			driver = new FirefoxDriver();
			System.out.println("FireFox Browser is Opened ");
		}
		driver.manage().window().maximize();
		logger1.log(Status.PASS, "Windows maximized successfully");
	  	driver.get("https://demoqa.com/");		
		logger1.log(Status.PASS, "Website launched successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}
	
	public static void handles(WebElement elements) throws Exception
	{
		
		Set <String> s= driver.getWindowHandles();
		Iterator<String> i = s.iterator();
		String parent = i.next();		//0
		String child = i.next();		//1
		driver.switchTo().window(child);
		logger17.log(Status.PASS, "New Tab closed successfully");
		driver.close();
		driver.switchTo().window(parent);
	}
	
//	public static void whandle()
//	{
//	String parentWindow = driver.getWindowHandle();	
//	To open child window to perform click operation
//	Set<String> handles =  driver.getWindowHandles();
//	   for(String windowHandle  : handles)
//	       {
//	       if(!windowHandle.equals(parentWindow))
//	          {
//	          driver.switchTo().window(windowHandle);
////	         <!--Perform your operation here for new window-->
//	         driver.close(); //closing child window
//	         driver.switchTo().window(parentWindow); //cntrl to parent window
//	          }
//	       }
//	}  
	public void scroll()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
	}
	public void sleep() throws Exception
	{
		Thread.sleep(2000);
	}
	
	public void teardown()
	{
		logger12.log(Status.PASS, "Browser closed successfully");
		extent.flush();    //it will generate report file
		driver.close();
	}
	
}
