package clocksoftware.BaseClass;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import clocksoftware.pageobject.LandingPageDB;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
	public static WebDriver driver;
public WebDriver IntializerDriver(WebDriver driver) throws Exception {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//clocksoftware//resource//GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
		    WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
		}
	        else if(browserName.equalsIgnoreCase("firefox"))  {
	        	
	        }    
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        return driver;
}
	
	public LandingPageDB LaunchApplication() throws Exception {
		driver = IntializerDriver(driver);
		LandingPageDB landingPage = new LandingPageDB(driver);
		landingPage.goTo();
		return landingPage;
        
	}
}