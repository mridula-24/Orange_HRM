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

public class facebook{ 
	WebDriver driver;
    @BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
}

	@Test(dataProvider = "dp")
	public void adminlogin (String user,String pass ) throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("email")).sendKeys(user);
		driver.findElement(By.name("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String Expected = "home";
		String Actual =driver.getCurrentUrl();
		if(Actual.contains(Expected))
		{
			Reporter.log("Login success     "+Expected+"     "+Actual,true);
		}

		else

		{  
			String Error_mess =driver.findElement(By.id("(@d,'M9.464 1.2")).getText();
		    Reporter.log(Error_mess+"    "+Expected+"       "+Actual,true);

		}
	}

	@DataProvider
     public Object[][] dp() {
		Object login[][] = {{"9893181468","qwerty@2468"},
				           {"test","qwerty@2468"  },
				           {" "," "               },
				           {"Admin",  " "         },
				           {"9893181468","qwerty@2468"}};
		return login;			  
	}

	@AfterTest

	public void afterTest() {
		driver.quit();
	}

}

