package testNg_UploadFile;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Uploadfile {
	WebDriver driver;
	
	
  @Test
  public void attachfile() throws InterruptedException {
	  driver.get("http://baalabharathi.com/upload-story/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"textarea-5589244956\"]")).sendKeys("Testdemo");
	driver.findElement(By.xpath("//*[@id=\"field-8lqEle2zeOhMu0a\"]")).sendKeys("C:\\Users\\sures\\OneDrive\\Desktop\\download.webp");
	  
	  
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
