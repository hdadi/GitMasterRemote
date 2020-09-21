package amazonAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class LoginToAmazonTest {
	WebDriver driver;
@Test
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
