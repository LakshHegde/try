package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	
public WebDriver driver;

public ForgotPassword(WebDriver driver) {
		super();
		this.driver = driver;
	}
 	By email =By.id("user_email");
	By sendmeinstructions =By.cssSelector("[type='submit']");
	

	public WebElement email() {
		return driver.findElement(email);
	}

	public WebElement sendmeinstructions() {
		return driver.findElement(sendmeinstructions);
	}
}

