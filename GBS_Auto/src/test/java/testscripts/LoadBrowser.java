package testscripts;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoadBrowser {
	public WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver =  new ChromeDriver();
	  driver.navigate().to("https://gbs-plus-test.info/lms-master-test/login");
	  
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
//	  driver.quit();
	  
  }

}
