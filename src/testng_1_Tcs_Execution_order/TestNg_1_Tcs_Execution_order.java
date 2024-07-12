package testng_1_Tcs_Execution_order;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNg_1_Tcs_Execution_order {
	WebDriver driver;
	
	
  @Test
  public void youtube() throws Exception {
	  Logger log = Logger.getLogger("youtube");
	  PropertyConfigurator.configure("log4j.properties");
	  
	  driver.get("https://www.youtube.com");
	  log.info("Executing youtube test casse");
	  Thread.sleep(3000);
	  
  }
  
  
  @Test
  public void google() throws InterruptedException {
	  driver.get("https://www.google.com");
	  Thread.sleep(3000);
  }
  
  
  @Test
  public void facebook() throws InterruptedException {
	  driver.get("https://www.facebook.com");
	  Thread.sleep(3000);
  }
  
  
  @Test
  public void twitter() throws InterruptedException {
	  driver.get("https://www.twitter.com");
	  Thread.sleep(3000);
  }
  
  @Test
  public void flipkart() throws InterruptedException {
	  driver.get("https://www.flipkart.com");
	  Thread.sleep(3000);
  }
  
  
  
  @Test
  public void gmail() throws InterruptedException {
	  driver.get("https://www.gmail.com");
	  Thread.sleep(3000);
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  
  

  @AfterMethod
  public void afterMethod() {
	  
  }

}
