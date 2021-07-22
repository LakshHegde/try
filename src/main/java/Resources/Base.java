package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	public  WebDriver driver;
	public Properties prop;

	public WebDriver initialisedriver() throws IOException {

		prop = new Properties();
		//System.getProperty("user.dir")
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		//String Browsername = prop.getProperty("browser");
		String Browsername= System.getProperty("browser");

		System.out.println(Browsername);
		if (Browsername.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\laksh\\Downloads\\chromedriver.exe");
			ChromeOptions option=new ChromeOptions();
			if(Browsername.contains("headless")) {
				option.addArguments("headless");
			
			}
			driver = new ChromeDriver(option);
		}

		if (Browsername.equals("Firefox")) {

		}

		if (Browsername.equals("IE")) {

		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

	public String getScreenshotPath(String Testcasename, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\Reports\\" + Testcasename + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}
}
