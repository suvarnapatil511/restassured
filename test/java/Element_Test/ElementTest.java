package Element_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Base.Base;
import Element_pages.Element_page;

public class ElementTest extends Base{
	
	@BeforeSuite
	public void setup() {
		initialize_browser() ;
		
	}
	@Test
	public void element() throws Exception {
		Element_page e=PageFactory.initElements(driver,Element_page.class);
		e.Element();
		
	}
	@AfterSuite
	public void teardown() {
		driver.quit();
		
	}

}
