package rajeshjavaproject.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rajeshjavaproject.AbstractClass.WaitComponentDB;

public class ProductCatalogue extends WaitComponentDB{
	WebDriver driver;
	
	public ProductCatalogue(WebDriver driver) {
		super(driver);
		this.driver= driver;
	    PageFactory.initElements(driver, this);
	
}
	@FindBy(xpath="//div[@class='card-block']//p[contains(text(),'laptop')]")
	WebElement resultText;
	@FindBy(xpath="//a[text()='Sony vaio i5']")
	WebElement selectingProduct;
	@FindBy(xpath="//a[text()='Add to cart']")
	WebElement clickingOnAddtocart;
	@FindBy(xpath="//a[text()='Cart']")
	WebElement clickingonCart;
public boolean ValidatingProduct() {
	return resultText.isDisplayed();
	
}
public void SelectingProduct() throws InterruptedException {
	selectingProduct.click();
	//waitForElementToAppear();
	waitForElementToAppear2(By.xpath("//a[text()='Add to cart']"));
	
}
public void ClickingOnAddtocart() throws InterruptedException {
	clickingOnAddtocart.click();
	
	waitForElementToAppear();
}
public void AcceptingAlert() {
	
	driver.switchTo().alert().accept();
}
public void ClickingonCart() throws InterruptedException {
	clickingonCart.click();
	waitForElementToAppear2(By.xpath("//td[text()='Sony vaio i5']"));
}
}

