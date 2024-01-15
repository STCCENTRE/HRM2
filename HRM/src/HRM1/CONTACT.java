package HRM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class CONTACT
{
	public static WebDriver driver=null;
	public static ExtentReports reports;
	public static ExtentTest test;

@BeforeTest

	public void initialize() throws Exception  {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Jimmy Joy\\Desktop\\shabana\\seleniumnew\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        //driver = new FirefoxDriver();
	
		System.out.println("driver initialised");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		
	
	
	}

@BeforeSuite
public void reportGenerate()
{
	
	reports = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
	test = reports.startTest("ExtentDemo");
	
}

@AfterSuite
public void endTest()
{
reports.endTest(test);
reports.flush();
}

@AfterTest
public void tearDown() throws WebDriverException
{
		
			
			//driver.close();
//			driver.quit();

}


}
