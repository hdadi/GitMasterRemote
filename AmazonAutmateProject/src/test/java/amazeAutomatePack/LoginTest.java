package amazeAutomatePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;

	@BeforeClass
public void openbrowser()
{
	System.setProperty("webdriver.gecko.driver","F:\\BROWSERFILES\\geckodriver.exe");
	FirefoxOptions options = new FirefoxOptions();
	options.setCapability("marionette", false);
	driver = new FirefoxDriver(options);
	driver.get("https://www.facebook.com/");
}
	@Test
	public void openfb() throws InterruptedException
	{
		/* *****************This is to just test the COMMIT AND PUSH **************** */
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("TestEmail");
		driver.findElement(By.xpath(".//input[@id='pass']")).sendKeys("TestEmail");
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
	}
	@AfterClass
	public void endTest()
	{
		driver.quit();
	}

}
