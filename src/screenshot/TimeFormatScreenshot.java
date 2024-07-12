package screenshot;

import org.testng.annotations.Test;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TimeFormatScreenshot {
	WebDriver driver;
  
  public void Screenshot() throws IOException {
	 SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY_MMM_DD HH_MM_SS");
	  Date date = new Date();
	  String time = dateFormat.format(date);
	  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f,new File("D:\\bug\\Googlesearch_"+time+".png"));}
	  
	  @Test
	  public void googleSearch() throws InterruptedException, IOException {
		  driver.get("https:www.google.com");
		  Thread.sleep(2000);
		  Screenshot();
		  
	driver.findElement(By.name("q")).sendKeys("Tirupati");
		  Thread.sleep(2000);
		  Screenshot();

 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
   Thread.sleep(2000);
   Screenshot();
   
   driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
   Thread.sleep(2000);
   Screenshot();
   
   driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
   Thread.sleep(2000);
   Screenshot();
   
		  
		  
		  
	  
	  
	    
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();  
	  
  }

}
