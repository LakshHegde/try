package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	 By email =By.id("user_email");
	 By Password =By.id("user_password");
	 By go= By.name("commit");
	 By forgotpassword=By.cssSelector("[href*='password/new']");
	
	
	public WebElement email() {
		return driver.findElement(email);
	}
	
	public WebElement Password() {
		return driver.findElement(Password);
	}
	
	public WebElement go() {
		return driver.findElement(go);
	}
	public ForgotPassword forgotpassword() {
		 driver.findElement(forgotpassword).click();
		 ForgotPassword fp= new ForgotPassword(driver);
		 return fp;
	}
}
