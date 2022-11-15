package rajeshjavaproject.Tests;

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

import com.google.errorprone.annotations.Var;

import rajeshjavaproject.Demoblaza.BaseClass;
import rajeshjavaproject.pageobject.CartPage;
import rajeshjavaproject.pageobject.ComfirmationPage;
import rajeshjavaproject.pageobject.LandingPageDB;
import rajeshjavaproject.pageobject.ProductCatalogue;

public class SubmitingOrderTest extends BaseClass{
	BaseClass baseClass =new BaseClass();
	
	//WebDriver driver;

@BeforeTest
	public void BeforeTest(){
	//baseClass.intializerDriver(driver);
	baseClass.LaunchApplication();
	}
	
@Test
public void SubmitingOrderTest() throws InterruptedException {
   
    LandingPageDB landingPage=new LandingPageDB(BaseClass.driver);
	Assert.assertEquals(landingPage.HomeText() ,"CATEGORIES");
	landingPage.SelectingLaptops();
	ProductCatalogue productCatalogue = new ProductCatalogue(BaseClass.driver);
	Assert.assertTrue(productCatalogue.ValidatingProduct());
	productCatalogue.SelectingProduct();
	productCatalogue.ClickingOnAddtocart();
	productCatalogue.AcceptingAlert();
	productCatalogue.ClickingonCart();
	CartPage cartPage =new CartPage(BaseClass.driver);
	Assert.assertTrue(cartPage.CartProductVaildate());
	cartPage.ClickingOnPlaceorder();
	ComfirmationPage comfirmationPage = new ComfirmationPage(BaseClass.driver);
	comfirmationPage.EnteringDetails();
	comfirmationPage.PurchaseButton();
	Assert.assertTrue(comfirmationPage.VaildatingOrder());
	}
@AfterTest
public void AfterTest() {
driver.close();
}


}
