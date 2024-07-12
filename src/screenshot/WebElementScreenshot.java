package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class WebElementScreenshot {
	WebDriver driver;
  @Test
  public void TakeScreenShot() throws InterruptedException, IOException {
	  driver.get("https:www.google.com");
	  Thread.sleep(2000);
	  WebElement googlename=driver.findElement(By.xpath("//div[@id='hdtb-tls']"));
	  File f = googlename.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f,new File("D:\\bug\\googlename.png"));
	 // WebElement s= driver.findElement(By.name("q"));s.sendKeys("Testng");
	  //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
