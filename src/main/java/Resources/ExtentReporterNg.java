package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNg {

	static ExtentReports extent;

	public static ExtentReports getReportobject() {
		//ExtentReports //ExtentSparkReporter
			String File1=System.getProperty("user.dir")+"\\Reports\\index.html"; 
			ExtentSparkReporter report = new ExtentSparkReporter(File1);
			report.config().setReportName("webbbbb");
			report.config().setDocumentTitle("webbbbtitle");
			
			extent= new ExtentReports();
			extent.attachReporter(report);
			extent.setSystemInfo("tester","Laksh");
			return extent;
		}
		
}
