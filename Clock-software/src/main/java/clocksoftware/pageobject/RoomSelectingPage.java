package clocksoftware.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import clocksoftware.AbstractClass.CommonUtilities;

public class RoomSelectingPage extends CommonUtilities{
	WebDriver driver;
	
	public RoomSelectingPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
	    PageFactory.initElements(driver, this);	
}
	@FindBy(xpath="//div[@id='bookable_container_15343']//div[@class='col-md-6'][2]//table//tbody//tr//td[@class]//h4")
	List<WebElement> priceForNight;
	@FindBy(xpath="(//div[@id='bookable_container_15343']//div[@class='col-md-6'][2]//table//tbody//tr//td[@class='hidden-xs nowrap'])[4]//span//a")
	WebElement expensivepriceselecting;
	
	
	public void SelectingRoom() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		
		WebElement iframe= driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		expensivepriceselecting.click();
		driver.switchTo().defaultContent();
		waitForElementToAppear();
       
	}
	
	}

