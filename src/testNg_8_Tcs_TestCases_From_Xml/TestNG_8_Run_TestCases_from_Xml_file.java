package testNg_8_Tcs_TestCases_From_Xml;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_8_Run_TestCases_from_Xml_file {
	WebDriver driver;
  @Test
  public void google() {
	  driver.get("https://www.google.com");
  }
  @Test
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  @Test
  public void twitter() {
	  driver.get("https://www.twitter.com");
  }
  @Test
  public void redmine() {
	  driver.get("https://www.redmine.org");
  }
  @Test
  public void selenium() {
	  driver.get("https://www.selenium.dev");
  }
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com");
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
