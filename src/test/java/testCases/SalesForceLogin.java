package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceLogin {
	
	WebDriver driver;

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

	}

	@Test
	public void login()  throws Exception{
		driver.get("https://login.salesforce.com/");
		
	//Thread.sleep(3000);
	
	WebElement username = driver.findElement(By.id("username"));
	WebElement password = driver.findElement(By.id("password"));
	
	username.sendKeys("test");
	password.sendKeys("test123");
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	
	
	username.sendKeys("test");
	password.sendKeys("test123");
	Thread.sleep(3000);
	
	}
	
	@AfterClass
	public void teardown() {

		driver.quit();

}
}
