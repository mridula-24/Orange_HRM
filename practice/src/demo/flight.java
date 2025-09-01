package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flight {

	public static void main(String[] args) {
	/*	WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.id("email")).sendKeys("mridulayenmandra@gmail.com");
		driver.findElement(By.name("password")).sendKeys("mridula@24");
		driver.findElement(By.name("sign in")).click();*/
		
		 
	/*	WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("mridula");
		driver.findElement(By.id("contact")).sendKeys("9893181468");
		driver.findElement(By.id("email")).sendKeys("mridulayenmandra@gmail.com");
		driver.findElement(By.name("password")).sendKeys("mridula@24");
		driver.findElement(By.name("gender")).sendKeys("female");
		driver.findElement(By.name("dob")).sendKeys("24-24-1994");*/
		
	/*	WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		
		driver.get("https://flights.qedgetech.com");
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.name("dob")).click();
		
		
        String dob = "26/Oct/1965";
		
		String[] temp = dob.split("/");
		String dt = temp[0];
		String month = temp[1];
		String year = temp[2];
		
		Select mlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
		mlist.selectByVisibleText(month)	;
		
		Select ylist = new Select(driver.findElement(By.className("ui-datepicker-year")));
		ylist.selectByVisibleText(year);
			
		WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows = cal.findElements(By.tagName("tr"));
	
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for(WebElement element : cols)
			{
				if(element.getText().equals(dt))
				{
					element.click();
					break;
				}
			}	
		}
	}

}*/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.name("email")).sendKeys("sureshb@qedge.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.id("search-date")).click();
		
		String flydate = "31-December-2030";
		String[] temp = flydate.split("-");
		String dt = temp[0];
		String month = temp[1];
		String year = temp[2];
		
		String calyear = driver.findElement(By.className("ui-datepicker-year")).getText();		
		while(!calyear.equals(year))
		{
			driver.findElement(By.linkText("Next")).click();
			calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calmonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.linkText("Next")).click();
			calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows = cal.findElements(By.tagName("tr"));
	
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for(WebElement element : cols)
			{
				if(element.getText().equals(dt))
				{
					element.click();
					break;
				}
			}	
		}}}
