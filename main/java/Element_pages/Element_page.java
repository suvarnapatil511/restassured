package Element_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.Base;

public class Element_page extends Base {
	@FindBy(xpath="//h5[contains(text(),'Elements')]") WebElement elementclk;
	
	public void Element() throws InterruptedException {
		clk();
		elementclk.click();
		sleep();
		

		
	}
	
	

}
