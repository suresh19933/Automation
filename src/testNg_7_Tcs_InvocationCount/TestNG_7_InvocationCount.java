package testNg_7_Tcs_InvocationCount;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_7_InvocationCount {
	WebDriver driver;
	 @Test
	  public void Method1() {
		  driver.get("https:www.google.com");
		  driver.findElement(By.name("q")).sendKeys("ketika");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  driver.findElement(By.xpath("//div[@class='YmvwI'][normalize-space()='Images']")).click();
	  }
	  @Test(invocationCount=2)
	  public void Method2() {
		  
		  driver.get("https:www.google.com");
		  driver.findElement(By.name("q")).sendKeys("rashmika");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  driver.findElement(By.xpath("//div[@class='YmvwI'][normalize-space()='Images']")).click();
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
