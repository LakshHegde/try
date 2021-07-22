package Academy;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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

public class ValidateTitle extends Base {
	public WebDriver driver;
	private static Logger log= LogManager.getLogger(HomePage.class.getName());
	
	LandingPage l;
	@Test	
public void HomePageLogin() throws IOException  {
		
		//driver= initialisedriver();
		//driver.get("http://www.qaclickacademy.com/"); 
		//driver.get(prop.getProperty("URL")); prop.getProperty("browser");
		l=new LandingPage(driver);
		//Assert.assertTrue( l.navbar().isDisplayed());
		
			log.info("success");
		Assert.assertEquals(l.title().getText(), "FEATURED COURSE");
		
		}

@BeforeTest
public void Initialise() throws IOException {
	driver= initialisedriver();
	log.info("log is initialised");
	driver.get("http://www.qaclickacademy.com/");
	log.info("URL is hit");
}

@AfterTest
public void teardown() {
driver.close();

}
@Test
public void validateheader() throws IOException  {
	
		
Assert.assertEquals("", "header");
	
	}


}


