package rmssikulidemotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class democlass {

	

	public static void main(String[] args) throws FindFailed
	{
		// TODO Auto-generated method stub
	    WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		  driver.get("https://rms.koenig-solutions.com/");
	       
	       
	        Screen screen= new Screen();
	        Pattern email=new Pattern("C:\\Users\\CLOUD\\Desktop\\ccsp\\emailid.PNG");
	       Pattern passwordf=new Pattern("C:\\Users\\CLOUD\\Desktop\\ccsp\\password.PNG");
	        Pattern btnf=new Pattern("C:\\Users\\CLOUD\\Desktop\\ccsp\\button.PNG");
	       // screen.wait(email,2000);
	       screen.type(email, "nishant.singh@koenig-solutions.com");
	       screen.type(passwordf, "xyz");
	       screen.click(btnf);
	}

}
