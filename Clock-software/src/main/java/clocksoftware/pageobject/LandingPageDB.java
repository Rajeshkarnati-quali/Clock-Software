package clocksoftware.pageobject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import clocksoftware.AbstractClass.CommonUtilities;


public class LandingPageDB extends CommonUtilities {
	WebDriver driver;
	
		public LandingPageDB(WebDriver driver) {
			super(driver);
			this.driver= driver;
		    PageFactory.initElements(driver, this);
		    
		
	}
		@FindBy(xpath="//a[text()='Check availability']")
		WebElement homePageText;
		@FindBy(xpath="//label[text()='Arrival:']//following-sibling::input")
		WebElement datePicker;
		@FindBy(xpath="//input[@value='Book now !']")
		WebElement bookNow ;
		@FindBy(id="to-place")
		WebElement selectnight ;
	public void goTo() {
		driver.get("https://www.clock-software.com/demo-clockpms/index.html");
	}
	
	public String HomeText()
	{
		return homePageText.getText();
	}
	public void CalenderPicker() throws InterruptedException {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		String today= date.toString();
		datePicker.sendKeys("17-08-2023");
		selectnight.click();
		selectnight.clear();
		selectnight.sendKeys("4");
		bookNow.click();
		
		
	}

	
}
