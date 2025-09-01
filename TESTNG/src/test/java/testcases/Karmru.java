package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Karmru 
{ WebDriver driver;

@BeforeTest
public void beforeTest() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();

}

@Test(dataProvider = "dp")
public void adminitrationlogin(String user,String pass ) throws InterruptedException {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("username")).sendKeys(user);
	driver.findElement(By.name("password")).sendKeys(pass);
	driver.findElement(By.name("//button[@type='submit']")).click();
	Thread.sleep(2000);
	String Expected = "dashboard";
	String Actual =driver.getCurrentUrl();
	if(Actual.contains(Expected))
	{
		Reporter.log("Login success    "+Expected+"      "+Actual,true);
	}

	else

	{  String Error_mess =driver.findElement(By.id("spanmessage")).getText();
	Reporter.log(Error_mess+"      "+Expected+"        "+Actual,true);

	}
}

@DataProvider

public Object[][] dp() {
	Object login[][] = {{"Admin","Qedge123!@#"},
			{"test","Qedge123!@#"},
			{"","Qedge123!@#"},
			{"Admin",""}};

	return login;			  
}

@AfterTest

public void afterTest() {
	driver.quit();
}

}
