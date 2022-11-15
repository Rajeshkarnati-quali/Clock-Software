package rajeshjavaproject.Demoblaza;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import rajeshjavaproject.pageobject.LandingPageDB;

public class BaseClass{
	public static WebDriver driver;
	

	/*public WebDriver intializerDriver() throws Exception {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//rajeshacademy//resources//GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
		    WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        
	}
}
	public LandingPageDB launchApplication() throws Exception {
		driver = intializerDriver();
		LandingPageDB landingPage =new LandingPageDB(driver);
        landingPage.goTo();
        return landingPage;
		
	}*/
	public WebDriver IntializerDriver(WebDriver driver) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh karnati\\Downloads\\chromedriver_win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	return driver;
	
}
	public LandingPageDB LaunchApplication() {
		driver = IntializerDriver(driver);
		LandingPageDB landingPage = new LandingPageDB(driver);
		landingPage.goTo();
		return landingPage;
        
	}
	/*public void waitForElementToAppear() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Thread.sleep(2000);
	}
	public void waitForElementToAppear2(By findBy) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}*/
	
}
