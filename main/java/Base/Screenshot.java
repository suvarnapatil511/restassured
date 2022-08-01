package Base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot extends Base{
	public static String CaptureSceenshot(WebDriver driver, String Screenshot_name) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path="./sceenshot"+Screenshot_name+".png";
		File dest=new File(path);
		FileUtils.copyFile(src, dest);
		return path;


}}

