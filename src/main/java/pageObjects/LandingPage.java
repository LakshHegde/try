package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	private By signin =By.xpath("//a[contains(@href, 'sign_in')]");
	private By title =By.xpath("//section[@id='content']/div/div");
	private By Navbar =By.xpath("//*['@id=homepage']/header/div[2]/div/nav");
	private By header= By.cssSelector(""); 
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	
	
	
	
	public LoginPage signin() {
		 driver.findElement(signin).click();
		 LoginPage lo= new LoginPage(driver);
		 return lo;
	}
	
	public WebElement title() {
		return driver.findElement(title);
	}
	
	public WebElement navbar() {
		return driver.findElement(Navbar);
	}
	
	public WebElement header() {
		return driver.findElement(header);
	}

}	

