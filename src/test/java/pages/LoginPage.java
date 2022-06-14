package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
   By username = By.id("txtUsername");
    By password = By.id("txtPassword");
    By loginBtn = By.id("btnLogin");
	
    
    
    public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
    
    
    public WebElement getUsername () {
    	
    	return driver.findElement(username);
    	
    	
    }
    
 public WebElement getPassword () {
    	
    	return driver.findElement(password);
    	  	
    }
    
 public WebElement getLoginButton () {
 	
 	return driver.findElement(loginBtn);
 	  	
 }
 
 
 
}
