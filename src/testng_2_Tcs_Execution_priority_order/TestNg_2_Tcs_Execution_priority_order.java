package testng_2_Tcs_Execution_priority_order;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNg_2_Tcs_Execution_priority_order {
	WebDriver driver;
	
	
  @Test(priority=0)
  public void youtube() throws Exception {
	  driver.get("https://www.youtube.com");
	  Thread.sleep(3000);
  }
  
  
  @Test(priority=2)
  public void google() throws InterruptedException {
	  driver.get("https://www.google.com");
	  Thread.sleep(3000);
  }
  
  
  @Test(priority=1)
  public void facebook() throws InterruptedException {
	  driver.get("https://www.facebook.com");
	  Thread.sleep(3000);
  }
  
  
  @Test(priority=3)
  public void twitter() throws InterruptedException {
	  driver.get("https://www.twitter.com");
	  Thread.sleep(3000);
  }
  
  @Test(priority=5)
  public void flipkart() throws InterruptedException {
	  driver.get("https://www.flipkart.com");
	  Thread.sleep(3000);
  }
  
  
  
  @Test(priority=4)
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
