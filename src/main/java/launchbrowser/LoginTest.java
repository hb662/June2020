package launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver;
	public static void main(String[] args) {
	
		launchbrowser();
		logintest();
		teardown();
		
		launchbrowser();
		logintest1();
		teardown();
		
		launchbrowser();
		logintest2();
		teardown();
	}
	
	public static void launchbrowser() {
		//set the property for chrome driver
				System.setProperty("webdriver.chrome.driver","C:\\Eclipseselenium\\crm\\driver\\chromedriver.exe");
				//Created object of webdrive
				 driver = new ChromeDriver();
				//going to website
				driver.get("https://techfios.com/billing/?ng=admin/");
				//maximize window
				driver.manage().window().maximize();
	}
	public static void logintest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		
		
	}
	
	//ctl+sft+/ for commimting
	//ctl+sft+\ for on commimting
	public static void logintest1() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		}
	
	public static void logintest2() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		
		
	}
	public static void teardown() {
		driver.close();
		
	}
	
}
