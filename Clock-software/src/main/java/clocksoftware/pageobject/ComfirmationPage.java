package clocksoftware.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import clocksoftware.AbstractClass.CommonUtilities;

public class ComfirmationPage extends CommonUtilities{
	WebDriver driver;
	
	public ComfirmationPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
	    PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//h1[text()='Thank you for your booking!']")
	WebElement vaildatingSucessBookingMSG;
	public String VaildatingSucessBookingMSG() {
		WindowScrollDown();
		return vaildatingSucessBookingMSG.getText();
		
	}
	
}
