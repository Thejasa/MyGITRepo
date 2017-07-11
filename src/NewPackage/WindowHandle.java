package NewPackage;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.*;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WindowHandle {
	WebDriver driver;
	
	@BeforeTest
	public void SetUp(){
		 /* ProfilesIni allprofiles = new ProfilesIni();
		  FirefoxProfile profile= allprofiles.getProfile("Webdriver_Profile");	  
		  driver = new FirefoxDriver(profile);*/
		  
		  File file = new File("C:\\Users\\user\\Downloads\\IEDriverServer_Win32_2.49.0\\IEDriverServer.exe");
		  System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		  driver = new InternetExplorerDriver();				
	}
	
  @Parameters({"House"})
  @Test
  public void Test1(String strHome) {	 
	
	System.out.println(strHome);
	
	 /* driver.get("http://www.tatadocomo.com/");
	  String parentHandle = driver.getWindowHandle();
	  driver.findElement(By.xpath("//cufon[@alt='Recharge']")).click();
	   
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   
	   Set<String> Handles = driver.getWindowHandles();	   
	   
	   for (String Handle : Handles){
		   
		   if (Handle != parentHandle){
			   
			   String childHandle = Handle;
			   
			   driver.switchTo().window(childHandle);
		   }		   
	   }
	   
	   driver.findElement(By.id("quick")).click();
	   driver.findElement(By.id("mdn")).sendKeys("9995876184");
	   
	   driver.switchTo().window(parentHandle);	    
	   driver.findElement(By.id("gsc-i-id1")).sendKeys("prepaid");  */
	    	    
  }
  
  @AfterTest
  public void TearDown(){
	  
	  driver.quit();
	  
  }
}
