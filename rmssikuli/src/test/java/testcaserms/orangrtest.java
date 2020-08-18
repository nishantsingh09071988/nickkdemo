package testcaserms;

import java.io.IOException;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import orangrchk.baseclass;

public class orangrtest 


{
	ExtentHtmlReporter htmlReporter;

	ExtentReports extr;


	@BeforeSuite
	public void startupclass()
	{
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extr = new ExtentReports();
		extr.attachReporter(htmlReporter);




	}




	@Test
	public void nicktest() throws Exception 
	{

		ExtentTest test=extr.createTest("myfirsttest", "nishant demo");
		test.log(Status.INFO, "This step shows usage of log(status, details)");


		test.info("This step shows usage of info(details)");


		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());


		test.addScreenCaptureFromPath("screenshot.png");

	}
	@Test
	public void nicktest1() throws Exception 
	{

		ExtentTest test=extr.createTest("myfirsttest", "nishant demo");
		test.log(Status.INFO, "This step shows usage of log(status, details)");


		test.info("This step shows usage of info(details)");


		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());


		test.addScreenCaptureFromPath("screenshot.png");

	}
	@AfterSuite

	public void closetest() 
	{

		extr.flush();

	}


}
