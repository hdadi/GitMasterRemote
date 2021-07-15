package amazeAutomatePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

// COMMENT FROM THE GIT HUB CLOUD - MASTER
public class LoginTest {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	@BeforeMethod
	public void setReport()
	{
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("F:\\GitLocalRepo\\GitMasterRemote\\AmazonAutmateProject\\test-output\\emailable-report.html");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		test=extent.createTest("Testmethod");
		test.log(Status.INFO,"Reporting started for");
		
		
	}
	
	
	@BeforeClass
public void openbrowser()
{
	
	test.log(Status.INFO,"Logging into facebook");
	System.setProperty("webdriver.gecko.driver","F:\\BROWSERFILES\\geckodriver.exe");
	FirefoxOptions options = new FirefoxOptions();
	options.setCapability("marionette", false);
	driver = new FirefoxDriver(options);
	driver.get("https://www.facebook.com/");
	extent.flush();
}
	@Test(priority=1)
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

		System.out.println("THE TITLE IS :"+driver.getTitle());

		System.out.println(driver.getTitle());
		/* THIS IS THE END OF THE TEST */

		
	}
	@Test
	public void test1()
	{
		System.out.println("This is to just test the extent reports");
	}
	@AfterClass
	public void endTest()
	{
		driver.quit();
		extent.flush();
	}

}
