package pagescrolldownup;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class PageScrollDownUp {
	WebDriver driver;
  @Test
  public void scrolldown() throws Exception {
	  driver.get("https://www.selenium.dev/downloads/");
	  Thread.sleep(2000);
	 JavascriptExecutor jse=(JavascriptExecutor)driver;
	  jse.executeScript("scroll(0,2500)");
	  Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[normalize-space()='snapshot repository']")).click();
	 Thread.sleep(2000);
	 driver.navigate().back();
  }
  @Test
  public void scrolldown1() throws Exception {
	  driver.get("https://www.selenium.dev/downloads/");
	  Thread.sleep(2000);
	 JavascriptExecutor jse=(JavascriptExecutor)driver;
	  jse.executeScript("scroll(2500,0)");
	  Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[normalize-space()='other languages exist']")).click();
	 driver.navigate().back();
  }
  @Test
  public void IdentifyLocatorElement() throws Exception{
	  driver.get("https://www.selenium.dev/downloads/");
	   {
           WebElement element = (WebElement)driver;
           driver.findElement(By.xpath("//a[normalize-space()='GitHub repository']"));
           Coordinates coordinate = ((Locatable)element).getCoordinates(); 
           coordinate.onPage(); 
           coordinate.inViewPort();
            }    
	   driver.findElement(By.xpath("//a[normalize-space()='GitHub repository']")).click();

		  
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
