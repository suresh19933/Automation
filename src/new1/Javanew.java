package new1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

class Javanew {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//driver = new ChromeDriver();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}
	

	@Test
	void javanew() throws Exception {
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7989855023");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("14921492");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("//span[@class='hm-icon-label']")).click();
		/*driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible']//li[17]//a[1]")).click();
		driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible hmenu-translateX']//li[17]//a[1]")).click();
		driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible hmenu-translateX']//a[@class='hmenu-item'][normalize-space()='Fashion Sales & Deals']")).click();*/
		driver.findElement(By.xpath("//a[@class='hmenu-item'][normalize-space()='Sign Out']")).click();
		

	}

}
