package testcaserms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import loginrms.loginpage;



public class logintest 

{
	

	@Test
	public void lgnpge()
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();

		loginpage lgn=new loginpage(driver);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
		lgn.login();
		String mainurl= driver.getCurrentUrl();
		String wanturl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(mainurl, wanturl);
		
		
		
		
	}
	@Test
	public void logotest()
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		loginpage lgn=new loginpage(driver);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		boolean flag=lgn.validatelogo();
		Assert.assertTrue(flag);
		
		
		
		
	}
	
	
		
	}