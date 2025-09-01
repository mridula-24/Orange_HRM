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

public class Orange_HRM{ 
	WebDriver driver;
    @BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
}

	@Test(dataProvider = "dp")
	public void adminlogin (String user,String pass ) throws InterruptedException {
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("txtUsername")).sendKeys(user);
		driver.findElement(By.name("txtPassword")).sendKeys(pass);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		String Expected = "dashboard";
		String Actual =driver.getCurrentUrl();
		if(Actual.contains(Expected))
		{
			Reporter.log("Login success     "+Expected+"     "+Actual,false);
		}

		else

		{  
			String Error_mess =driver.findElement(By.id("spanMessage")).getText();
		    Reporter.log(Error_mess+"    "+Expected+"       "+Actual,false);

		}
	}

	@DataProvider
     public Object[][] dp() {
		Object login[][] = {{"Admin","Qedge123!@#"},
				           {"test","Qedge123!@#"  },
				           {" ","Qedge123!@#"     },
				           {"Admin",  " "         },
				           {"Admin","Qedge123!@#"}};
		return login;			  
	}

	@AfterTest

	public void afterTest() {
		driver.quit();
	}

}

