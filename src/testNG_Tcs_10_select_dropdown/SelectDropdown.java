package testNG_Tcs_10_select_dropdown;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class SelectDropdown {
	WebDriver driver;
	
	
  @Test
  public void dropdown() {
	  driver.get("http://www.redmine.org");
	  driver.findElement(By.xpath("//a[@href=\"/account/register\"]")).click();
	  driver.findElement(By.xpath("//input[@name=\"user[mail]\"]")).sendKeys("suresh@gmail.com");
	 //new Select(driver.findElement(By.xpath("//select[@name=\"user[language]\"]"))).selectByVisibleText("Galician (Galego)");
	Select obj = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
	  obj.selectByValue("fr");
	 obj.selectByVisibleText("Dutch (Nederlands)");
	  obj.selectByIndex(10);
	  
	
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	 // driver = new EdgeDriver();
	 // driver = new FirefoxDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
