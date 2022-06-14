package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	By welcomeBtn = By.id("welcome");
	By logoutLink = By.linkText("Logout");

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement getWelcomeBtn() {

		return driver.findElement(welcomeBtn);

	}

	public WebElement getlogoutLink() {

		return driver.findElement(logoutLink);

	}
}
