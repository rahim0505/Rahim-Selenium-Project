package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	/*
	 * By welcomeBtn = By.id("welcome"); By logoutLink = By.linkText("Logout");
	 */

	@FindBy(id = "welcome")
	WebElement welcomeBtn;

	@FindBy(linkText = "Logout")
	WebElement logoutLink;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void getWelcomeBtn() {

		welcomeBtn.click();

	}

	public void getlogoutLink() {

		logoutLink.click();
		;

	}
}
