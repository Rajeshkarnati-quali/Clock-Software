package clocksoftware.Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import clocksoftware.BaseClass.BaseClass;
import clocksoftware.pageobject.RoomSelectingPage;
import clocksoftware.pageobject.BookedRoomInfo;
import clocksoftware.pageobject.ComfirmationPage;
import clocksoftware.pageobject.CreditCardDetails;
import clocksoftware.pageobject.LandingPageDB;
import clocksoftware.pageobject.ServiceSelectingPage;

public class SubmitingOrderTest extends BaseClass{
	BaseClass baseClass =new BaseClass();
	

@BeforeTest
	public void BeforeTest() throws Exception{
	baseClass.LaunchApplication();
	}
	
@Test
public void SubmitingOrderTest() throws InterruptedException {
   
    LandingPageDB landingPage=new LandingPageDB(BaseClass.driver);
	Assert.assertEquals(landingPage.HomeText() ,"Check availability");
	landingPage.CalenderPicker();
	RoomSelectingPage roomSelectingPage =new RoomSelectingPage(BaseClass.driver);
	roomSelectingPage.SelectingRoom();
	ServiceSelectingPage serviceSelectingPage = new ServiceSelectingPage(BaseClass.driver);
	serviceSelectingPage.SelectingServices();
	serviceSelectingPage.ClickingOnAddServices();
	BookedRoomInfo bookedRoomInfo = new BookedRoomInfo(BaseClass.driver);
	bookedRoomInfo.EnteringInfo();
	Assert.assertEquals(bookedRoomInfo.ArrivalDate() ,"17 Aug 2023");
	Assert.assertEquals(bookedRoomInfo.StayingNight() ,"4");
	Assert.assertEquals(bookedRoomInfo.RoomType() ,"Deluxe Appartment");
	Assert.assertEquals(bookedRoomInfo.RoomRate() ,"1,640.00 EUR");
	Assert.assertEquals(bookedRoomInfo.TotalCost() ,"1,715.00 EUR");
	Assert.assertEquals(bookedRoomInfo.ServiceCost() ,"75.00 EUR");
	bookedRoomInfo.ClickingOnRadioButton();
	bookedRoomInfo.ClickingOnCheckBox();
	CreditCardDetails creditCardDetails = new CreditCardDetails(BaseClass.driver);
	creditCardDetails.EnterCardDetails();
	ComfirmationPage comfirmationPage = new ComfirmationPage(BaseClass.driver);
	String confrimMessage = comfirmationPage.VaildatingSucessBookingMSG();
	Assert.assertTrue(confrimMessage.equalsIgnoreCase("Thank you for your booking!"));
	}
@AfterTest
public void AfterTest() {
driver.close();
}


}
