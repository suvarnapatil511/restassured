package com.afw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.parent.Base;

public class NestedFrames extends Base{

	@FindBy(xpath="//span[text()=\"Nested Frames\"]")WebElement nestedclk;
	@FindBy(xpath="//iframe[@srcdoc=\"<p>Child Iframe</p>\"]")WebElement child;
	@FindBy(xpath="//body//p[text()='Child Iframe']")WebElement childtext;
	
	public void nestedframes() throws Exception
	{
		scroll();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(nestedclk));
		nestedclk.click();
		logger20.log(Status.PASS,"Nested Frames Tab clicked successfully");
				
		driver.switchTo().frame("frame1");
		logger20.log(Status.PASS,"Entered in Parent Iframe field successfully");
		String text1 = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(text1);

		
		driver.switchTo().frame(child);
		String text2 = childtext.getText();
		System.out.println(text2);	
		logger20.log(Status.PASS,"Entered in Child Iframe field successfully");
		driver.switchTo().defaultContent();
		
		logger20.log(Status.PASS,"Get back to default content successfully");
		sleep();

		scroll();
	}
}
