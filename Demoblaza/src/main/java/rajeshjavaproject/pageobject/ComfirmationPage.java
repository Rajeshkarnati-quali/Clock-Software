package rajeshjavaproject.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rajeshjavaproject.AbstractClass.WaitComponentDB;

public class ComfirmationPage extends WaitComponentDB{
	//input[@id="name"]
	WebDriver driver;
	
	public ComfirmationPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
	    PageFactory.initElements(driver, this);
	    
	
}
	@FindBy(xpath="//div[@class='form-group']//label[text()='Name:']//following-sibling::input")
	WebElement nameBar;
	@FindBy(xpath="//div[@class='form-group']//label[text()='Country:']//following-sibling::input")
	WebElement countryBar;
	@FindBy(xpath="//div[@class='form-group']//label[text()='City:']//following-sibling::input")
	WebElement cityBar;
	@FindBy(xpath="//div[@class='form-group']//label[text()='Credit card:']//following-sibling::input")
	WebElement creditcardBar;
	@FindBy(xpath="//div[@class='form-group']//label[text()='Month:']//following-sibling::input")
	WebElement monthBar;
	@FindBy(xpath="//button[text()='Purchase']")
	WebElement purchase;
	@FindBy(xpath="//h2[text()='Thank you for your purchase!']")
	WebElement vaildatingOrder;
	public void EnteringDetails() {
		nameBar.sendKeys("rajesh");
		countryBar.sendKeys("india");
		cityBar.sendKeys("NLG");
		creditcardBar.sendKeys("12674894984");
		monthBar.sendKeys("12");
	}
	public void PurchaseButton() throws InterruptedException {
		purchase.click();
		waitForElementToAppear2(By.xpath("//h2[text()='Thank you for your purchase!']"));
	}
	public boolean VaildatingOrder() {
		return vaildatingOrder.isDisplayed();
	}
	
}
