package Academy;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.LandingPage;

public class ValidateNavigationBar extends Base {
	public WebDriver driver;
	private static Logger log= LogManager.getLogger(HomePage.class.getName());
	
@BeforeTest
public void Initialise() throws IOException {
	driver= initialisedriver();
	driver.get("http://www.qaclickacademy.com/");
}

@AfterTest
public void teardown() {
driver.close();

}


@Test
public void ValidateNavigation() throws IOException  {
		
		
		LandingPage l=new LandingPage(driver);
		
		Assert.assertTrue(l.navbar().isDisplayed());
		
}



}


