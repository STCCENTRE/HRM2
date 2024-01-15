package HRM1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ADDEMPLOYEE extends CONTACT
{
	@Test
	  public void createNewEmployee() throws Exception
	  {
		  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		  driver.findElement(By.name("firstName")).sendKeys("Reshma");
		  System.out.println("Firstname entered");
		  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		  driver.findElement(By.name("middleName")).sendKeys("Mary");
		  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		  driver.findElement(By.name("lastName")).sendKeys("Jacob");
		  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).clear();
		  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("1234");
		  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		  System.out.println("Clicked save button");
		  driver.findElement(By.linkText("Personal Details"));
		  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		  System.out.println("Personal details page displayed");
		  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		  }
	  
	 

}
