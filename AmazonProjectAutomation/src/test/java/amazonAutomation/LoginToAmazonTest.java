package amazonAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class LoginToAmazonTest {
	WebDriver driver;
	@BeforeClass
	public void beforeStart()
	{
		System.out.println("Hello before class");		
	}
@Test()
	public void loginto()
	{
	System.setProperty("webdriver.gecko.driver","F:\\BROWSERFILES\\geckodriver.exe");
	FirefoxOptions options = new FirefoxOptions();
	options.setCapability("marionette", false);
	driver = new FirefoxDriver(options);
	driver.get("https://www.facebook.com/");
	System.out.println("opened the Amazon site");
	}

}
