package iframes;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Iframes {
	WebDriver driver;
  @Test
  public void newtab() throws InterruptedException {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(3000);
	  driver.switchTo().frame("iframeResult");
	  driver.findElement(By.xpath("/html/body/button")).click();
	  driver.switchTo().alert().accept();
	  driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
  }
  @Test
  public void newframe() throws InterruptedException{
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(3000);
	  driver.switchTo().frame("iframeResult");
	  driver.findElement(By.xpath("//*[@onclick=\"myFunction()\"]")).click();
	//  driver.switchTo().alert().accept();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
