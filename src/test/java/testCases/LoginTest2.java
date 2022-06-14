package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.HomePage;
import pageFactory.LoginPage;

public class LoginTest2 {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

	}

	@Test
	public void login() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.click_on_LoginButton();
		
		hp.getWelcomeBtn();
		hp.getlogoutLink();
		

	}

	@AfterClass
	public void teardown() {

		driver.quit();

	}

}
