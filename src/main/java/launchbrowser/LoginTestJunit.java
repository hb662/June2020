package launchbrowser;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestJunit {

	WebDriver driver;
   
	@Before
	public void launchbrowser() {
		//set the property for chrome driver
				System.setProperty("webdriver.chrome.driver","C:\\Eclipseselenium\\crm\\driver\\chromedriver.exe");
				//Created object of webdrive
				 driver = new ChromeDriver();
				//going to website
				driver.get("https://techfios.com/billing/?ng=admin/");
				//maximize window
				driver.manage().window().maximize();
	}
	@Test
	public  void logintest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		}
	
	@Test
	public  void logintest1() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}
		
	//@Test
	//public  void logintest1() {
		//driver.findElement(By.id("username1")).sendKeys("demo@techfios.com");
		//driver.findElement(By.id("password")).sendKeys("abc123");
		//driver.findElement(By.name("login")).click();
		
		//}
	
	//@Test
	public  void logintest2() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		}
	@After
	public void teardown() {
		driver.close();
		
	}
}
