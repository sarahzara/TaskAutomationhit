package TestBase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions actions;
	public static String browserType ;
	
	
	@BeforeTest

    public void launchBrowser(){
		browserType = "Chrome";
    	if (browserType.equalsIgnoreCase("Chrome")) {
    		WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("Firefox")) {
        	WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        //ConfigUtil.loadTestConfigurations();
        
        driver.manage().deleteAllCookies();
        wait= new WebDriverWait(driver, Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        actions = new Actions(driver);
    }
    

	 @AfterTest
	public void cloaseBrowser() {
		driver.quit();
	}

}