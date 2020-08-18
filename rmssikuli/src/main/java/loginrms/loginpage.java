package loginrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class loginpage

{
 
	WebDriver driver;
	
	By username =By.id("txtUsername");
	By password =By.id("txtPassword");
	By btn =By.id("btnLogin");
	By logo=By.xpath("//*[@id='divLogo']/img");
	
	public loginpage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	public boolean validatelogo()
	{
		driver.findElement(logo).isDisplayed();
		return true;
		
		
	}
	
	public void login()
	{
		
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
		driver.findElement(btn).click();
	}
	
	
}
