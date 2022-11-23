package clocksoftware.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import clocksoftware.AbstractClass.CommonUtilities;

public class BookedRoomInfo extends CommonUtilities{
	WebDriver driver;
	
	public BookedRoomInfo(WebDriver driver) {
		super(driver);
		this.driver= driver;
	    PageFactory.initElements(driver, this);	
}
	@FindBy(xpath="//input[@name='booking[guest_attributes][e_mail]']")
	WebElement emailId;
	@FindBy(xpath="//input[@name='booking[guest_attributes][last_name]']")
	WebElement lastName;
	@FindBy(xpath="//input[@name='booking[guest_attributes][first_name]']")
	WebElement firstName;
	@FindBy(xpath="//input[@name='booking[guest_attributes][phone_number]']")
	WebElement phoneNumber;
	@FindBy(id="booking_payment_service_credit_card_collect")
	WebElement creditcardRadioButton;
	@FindBy(id="booking_agreed")
	WebElement checkBox;
	@FindBy(xpath="//input[@value='Create Booking']")
	WebElement confirmBookingButton;
	@FindBy(xpath="//div[text()='17 Aug 2023']")
	WebElement arrivalDate;
	@FindBy(xpath="//div[text()='4']")
	WebElement stayingNights;
	@FindBy(xpath="//div[text()='Deluxe Appartment']")
	WebElement roomType;
	@FindBy(xpath="//b[text()='Rooms']//following::div[text()='1,640.00 EUR']")
	WebElement roomRate;
	@FindBy(xpath="//h3[text()='1,715.00 EUR']")
	WebElement totalCost;
	@FindBy(xpath="//div[text()='75.00 EUR']")
	WebElement servicePrice;
	
	public void EnteringInfo() {
		emailId.sendKeys("karnati@gmail.com");
		lastName.sendKeys("karnati");
		firstName.sendKeys("raj");
		phoneNumber.sendKeys("9878676679");
	}
	public void ClickingOnRadioButton() {
		WindowScrollDown();
		creditcardRadioButton.click();
		}
	public void ClickingOnCheckBox() {
		WindowScrollDown();
		checkBox.click();
		confirmBookingButton.click();
	}
	public String ArrivalDate() {
		return arrivalDate.getText();
	}
	public String StayingNight() {
		return stayingNights.getText();
	}
	public String RoomType() {
		return roomType.getText();
	}
	public String RoomRate() {
		return roomRate.getText();
	}
	public String TotalCost() {
		return totalCost.getText();
	}
	public String ServiceCost() {
		return servicePrice.getText();
	}

	}