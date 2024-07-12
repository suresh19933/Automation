package new1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Class2 {
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		driver = new EdgeDriver();
		//driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();
		
		
			
	}
	
	
	

}
