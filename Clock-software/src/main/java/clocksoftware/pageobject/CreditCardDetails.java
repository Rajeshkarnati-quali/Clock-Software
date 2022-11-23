package clocksoftware.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import clocksoftware.AbstractClass.CommonUtilities;

public class CreditCardDetails extends CommonUtilities{
	WebDriver driver;
	
	public CreditCardDetails(WebDriver driver) {
		super(driver);
		this.driver= driver;
	    PageFactory.initElements(driver, this);	
}
	@FindBy(xpath="//input[@name='credit_card_collect_purchase[number]']")
	WebElement cardNumber;
	@FindBy(xpath="//select[@name='credit_card_collect_purchase[brand]']")
	WebElement selectBrand;
	@FindBy(xpath="//input[@name='credit_card_collect_purchase[holder_name]']")
	WebElement cardHolder;
	@FindBy(xpath="//select[@name='credit_card_collect_purchase[expire_month]']")
	WebElement expmonth;
	@FindBy(xpath="//select[@name='credit_card_collect_purchase[expire_year]']")
	WebElement expYear;
	@FindBy(xpath="//input[@name='credit_card_collect_purchase[address]']")
	WebElement cardAddress;
	@FindBy(xpath="//input[@name='credit_card_collect_purchase[zip]']")
	WebElement Zipcode;
	@FindBy(xpath="//input[@name='credit_card_collect_purchase[city]']")
	WebElement city;
	@FindBy(xpath="//input[@name='credit_card_collect_purchase[state]']")
	WebElement state;
	@FindBy(xpath="//select[@name='credit_card_collect_purchase[country]']")
	WebElement country;
	@FindBy(xpath="//div[@class='controls col-sm-8 col-sm-offset-4']//button")
	WebElement payButton;
	public void EnterCardDetails() {
		cardNumber.sendKeys("4242 4242 4242 4242");
		Select select = new Select(selectBrand);
		select.selectByVisibleText("VISA");
		cardHolder.sendKeys("raj karnati");
		Select expmont = new Select(expmonth);
		expmont.selectByVisibleText("12");
		Select expyear = new Select(expYear);
		expyear.selectByVisibleText("2023");
		cardAddress.sendKeys("6-6-43,ravindra");
		Zipcode.sendKeys("500055");
		city.sendKeys("nlg");
		state.sendKeys("telangana");
		Select county = new Select(country);
		county.selectByVisibleText("India");
		payButton.click();
		
		
	}
}
