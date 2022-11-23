package clocksoftware.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import clocksoftware.AbstractClass.CommonUtilities;

public class ServiceSelectingPage extends CommonUtilities{
	WebDriver driver;
	
	public ServiceSelectingPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
	    PageFactory.initElements(driver, this);
	
}
	@FindBy(xpath="(//div[@class='col-sm-2 h4']//input)[1]")
	WebElement quantity;
	@FindBy(xpath="(//div[@class='col-sm-2 h4']//input)[2]")
	WebElement quantity2;
	@FindBy(xpath="//input[@class='btn btn-primary btn-lg']")
	WebElement clickingOnAddServices;
	

public void SelectingServices() throws InterruptedException {
	WindowScrollDown();
	WebElement iframe2= driver.findElement(By.id("clock_pms_iframe_1"));
	driver.switchTo().frame(iframe2);
	quantity.sendKeys("1");;
	quantity2.sendKeys("1");
	waitForElementToAppear();	
}
public void ClickingOnAddServices() throws InterruptedException {
	clickingOnAddServices.click();
	waitForElementToAppear();
}


}

