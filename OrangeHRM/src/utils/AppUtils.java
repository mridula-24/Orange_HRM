package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.domsnapshot.model.StringIndex;

public class AppUtils 
{

	public static WebDriver driver;
	
	public static void launchApp(String url)
	{		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
		driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);		
	}
	
	
	public static void closeApp()
	{
		driver.close();
	}
	
}
