package Academy;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import net.bytebuddy.asm.Advice.Return;
import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends Base {
	public WebDriver driver;
	private static Logger log= LogManager.getLogger(HomePage.class.getName());
	
	
	@Test(dataProvider="getdata")
	public void HomePageLogin(String Username, String Password,String text) throws IOException  {
		
		//driver= initialisedriver();
		driver.get("http://www.qaclickacademy.com/");//driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		LoginPage lo=l.signin();
		//LoginPage lo =new LoginPage(driver);
		lo.email().sendKeys(Username);
		lo.Password().sendKeys(Password);
		System.out.println(text);
		lo.go().click();
		ForgotPassword fp=lo.forgotpassword();
		fp.email().sendKeys("bbyvyvvvy@gmail.com");
		fp.sendmeinstructions().click();
	}
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[2][3]; //[row][column]==== row how many times run, columns how many parameters. here row=2 col=3
		data[0][0]="restricted@gmail.com" ; data[0][1]="asdfgh"; data[0][2]="nonrestricted";
		data[1][0]="nonrestricted@gmail.com" ; data[1][1]="asdfgsssh"; data[1][2]="restricted";
		return data;
		
	}

	@BeforeTest
	public void Initialise() throws IOException {
		driver= initialisedriver();
		
	}
	@AfterTest
	public void teardown() {
	driver.close();

	} 

}



