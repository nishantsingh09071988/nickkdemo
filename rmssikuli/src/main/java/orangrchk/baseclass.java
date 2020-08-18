
package orangrchk;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import excellib.nishantexcelLibrary;
import io.github.bonigarcia.wdm.WebDriverManager;


public class baseclass

{
	nishantexcelLibrary nick=new nishantexcelLibrary("E:\\seleniumworkspace\\newdemo\\rmssikuli\\exceldata\\orangelogins.xlsx");
	public WebDriver driver;
	
	@BeforeMethod
	public void start() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("https://rms.koenig-solutions.com/");
		//Thread.sleep(2000);
		
		
	}
	
	
	 @DataProvider(name="logindata")
	public Object[][] getdata()
	{
		Object[][] orange=new Object[1][2];
		orange[0][0]="admin";
		orange[0][1]="admin123";
		
	
	
		
		return orange;
		
	}
	@DataProvider(name = "logindetexcel")
	public Object[][] exceldet()
	{
		
		int x=nick.getRowCount("Sheet1");
		int y=nick.getColumnCount("Sheet1");
		int xnew=x-1;
		
		Object[][] orangeexcel=new Object[xnew][y];
		
		for(int i=0;i<xnew;i++)
		{
			for(int j=0;j<y;j++)
			{
				orangeexcel[i][j]=nick.getCellData("Sheet1",j, i);
			}
			
		}
		
		return orangeexcel;
		
	}
	
	
	
	
	
	}
	
	
	

