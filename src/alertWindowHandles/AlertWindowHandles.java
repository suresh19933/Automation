package alertWindowHandles;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertWindowHandles {
	WebDriver driver;
  @Test
  public void alertokbutton() throws Exception {
	  driver.get("https://www.seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  driver.switchTo().alert().accept();
  }
  @Test
  public void alertcancelbutton() throws Exception {
	  driver.get("https://www.seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  driver.switchTo().alert().dismiss();
  }
  
  @Test
  public void sendtextokcancelbutton() throws Exception {
	  driver.get("https://www.seleniumlearn.com/prompt-dialog-box");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().sendKeys("suresh");
	  Thread.sleep(2000);
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
