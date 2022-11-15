package rajeshjavaproject.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rajeshjavaproject.AbstractClass.WaitComponentDB;


public class LandingPageDB extends WaitComponentDB {
	WebDriver driver;
	
		public LandingPageDB(WebDriver driver) {
			super(driver);
			this.driver= driver;
		    PageFactory.initElements(driver, this);
		    
		
	}
		@FindBy(xpath="//a[text()='CATEGORIES']")
		WebElement homePageText;
		@FindBy(xpath="//a[text()='Laptops']")
		WebElement laptops;
	public void goTo() {
		driver.get("https://www.demoblaze.com/");
	}
	
	public String HomeText()
	{
		//WebElement homePageText = driver.findElement(By.xpath("//a[text()='CATEGORIES']"));
		return homePageText.getText();
	}
	public void SelectingLaptops() throws InterruptedException {
		//WebElement laptops= driver.findElement(By.xpath("//a[text()='Laptops']"));
		laptops.click();
		//waitForElementToAppear();
		
	}

	
}
