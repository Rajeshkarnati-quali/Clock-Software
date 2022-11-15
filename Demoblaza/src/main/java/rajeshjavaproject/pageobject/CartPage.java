package rajeshjavaproject.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rajeshjavaproject.AbstractClass.WaitComponentDB;

public class CartPage extends WaitComponentDB{
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
	    PageFactory.initElements(driver, this);	
}
	@FindBy(xpath="//td[text()='Sony vaio i5']")
	WebElement cartproductvaildate;
	@FindBy(xpath="//button[text()='Place Order']")
	WebElement placeorder;
	public boolean CartProductVaildate() {
		return cartproductvaildate.isDisplayed();
	}
	public void ClickingOnPlaceorder() throws InterruptedException {
		placeorder.click();
		waitForElementToAppear2(By.xpath("//div[@class='form-group']//label[text()='Name:']//following-sibling::input"));
	}
}
