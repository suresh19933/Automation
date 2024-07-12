package testNg_5_Tcs_Description;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_5_Description {
	WebDriver driver;
	
  @Test(description="Top Menus Module Home")
  public void RM_1() {
	  
	  driver.findElement(By.xpath("//input[@id='username']")).click();
      driver.navigate().back();
  }
  @Test(description="Sigin")
  public void RM_2() {
	  driver.findElement(By.xpath("//a[@class='login']")).click();
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SURESHVS");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sureshvs");
	  driver.findElement(By.xpath("//input[@id='login-submit']")).click();
	
  }
  @Test(description="Registration")
  public void RM_3() {
	  driver.findElement(By.xpath("//a[@class='register']")).click();
	  //driver.navigate().back();
	  driver.findElement(By.xpath("//a[@class='home']")).click();
	  
  }
  @Test(description="Home Features")
  public void RM_4() {
	  driver.findElement(By.xpath("//a[normalize-space()='Redmine features']")).click();
	  
  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver =  new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.redmine.org");
  }

  @AfterTest
  public void afterTest() {
  }

}
