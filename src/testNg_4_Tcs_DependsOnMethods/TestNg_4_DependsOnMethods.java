package testNg_4_Tcs_DependsOnMethods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNg_4_DependsOnMethods {
	WebDriver driver;
	
	
  @Test (dependsOnMethods="Method2")
  public void Method1() {
	  driver.findElement(By.name("q")).sendKeys("TestNg");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
	  driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
	
  }
  
  @Test
  public void Method2 (){
	  driver.get("https://www.google.com");
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
