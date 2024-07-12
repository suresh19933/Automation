package testNG_popup_alerts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_11_Popup_Alerts {
	WebDriver driver;
	
  @Test
  public void alertokbutton() throws InterruptedException {
	  driver.get("https://seleniumlearn.com/confirmation-dialog-box");
	//  Thread.sleep(4000);
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	// Thread.sleep(3000);
	  driver.switchTo().alert().accept();
  }
  @Test
  public void alertcancelbutton() throws InterruptedException {
	  driver.get("https://seleniumlearn.com/confirmation-dialog-box");
	//  Thread.sleep(4000);
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	 Thread.sleep(3000);
	  driver.switchTo().alert().dismiss();
  }
  @Test
  public void sendKeysOkCancelButton() throws InterruptedException {
	  driver.get("https://seleniumlearn.com/prompt-dialog-box");
	Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@onclick=\"myFunction()\"]")).click();
	 /*Thread.sleep(3000);
	  driver.switchTo().alert().sendKeys("suresh");
	  driver.switchTo().alert().accept();*/
	  
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
