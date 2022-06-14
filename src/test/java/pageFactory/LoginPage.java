package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	/*
	 * By username = By.id("txtUsername"); By password = By.id("txtPassword"); By
	 * loginBtn = By.id("btnLogin");
	 */

	@FindBy(id = "txtUsername")
	WebElement username;

	@FindBy(id = "txtPassword")
	WebElement password;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String user) {

		username.sendKeys(user);

	}

	public void enterPassword(String pass) {

		password.sendKeys("pass");

	}

	public void click_on_LoginButton() {

		loginBtn.click();

	}

}
