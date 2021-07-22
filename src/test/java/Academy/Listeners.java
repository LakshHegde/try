package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Resources.Base;
import Resources.ExtentReporterNg;

public class Listeners extends Base  implements ITestListener{

	ExtentTest test;
	ExtentReports extent= ExtentReporterNg.getReportobject();
	
	ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
	
	
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		
	test=extent.createTest(result.getMethod().getMethodName());
	extentTest.set(test);
	}


	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		extentTest.get().log(Status.PASS,"Test ");
	}


	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	
		
		
		extentTest.get().fail(result.getThrowable());
		WebDriver driver=null;
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String testmethodname= result.getMethod().getMethodName();
		try {
			getScreenshotPath(testmethodname,driver); //extentTest.get().addScreenCaptureFromPath(getScreenshotPath(testmethodname,driver), result.getMethod().getMethodName());
			//extentTest.get().addScreenCaptureFromBase64String(getScreenshotPath(testmethodname,driver), result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		extent.flush();
	}

}
