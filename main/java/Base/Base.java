package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Base {
	public static ExtentSparkReporter report = new ExtentSparkReporter("C:\\Users\\user\\suvarna\\Toolsqa\\Rep");
	public static ExtentReports extent = new ExtentReports();
	public static ExtentTest logger1,logger2,logger3;

	
	public static WebDriver driver;
	public static Properties prop;
	public static void load_property_file() throws IOException
	{
     prop=new Properties();
     
     try {
	InputStream input=new FileInputStream(System.getProperty("user.dir")+"");
	prop.load(input);
	
	
  

     } catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
     }
	}
	
	//to get data from config property file
	public static String getobject(String Data) throws IOException
	{
		load_property_file();
		String data= prop.getProperty(Data);
		return data;
	
	}
	public void sleep() throws InterruptedException {
		Thread.sleep(2000);
		
		
	}
	public void clk() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");

	}
		 
	
	  public void initialize_browser() {
	
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\suvarna\\Toolsqa\\ChromeDriver\\chromedriver.exe");
		
			  driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.get("https://demoqa.com/");
	  }
	  
	         

}    


