package koenigrmssik;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSikuliExample 
{

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.get("https://rms.koenig-solutions.com/");
		Thread.sleep(3000);
		
		Screen s = new Screen();
		Pattern Username = new Pattern ("E:/seleniumworkspace/newdemo/rmssikuli/images");
		Pattern Password = new Pattern ("C:\\Users\\CLOUD\\Desktop\\ccsp\\password.PNG");
		Pattern Submit = new Pattern ("C:\\Users\\CLOUD\\Desktop\\ccsp\\button.PNG");
		
		//s.wait(Username,2000);
		//s.wait(Password,2000);
		//s.wait(Submit,2000);
		
		s.type(Username, "xxxxx");
		s.type(Password, "xxx");
		s.click(Submit);
	}
	
}