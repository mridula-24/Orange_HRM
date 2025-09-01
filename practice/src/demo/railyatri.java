package demo;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class railyatri {

	public static void main(String[] args) {
	//Script to count No. of Rows in a HTML Table
		/*WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/time-table");
		
		WebElement trains_table =  driver.findElement(By.className("timetable_table__4hbNj"));
		List<WebElement> rows = trains_table.findElements(By.tagName("tr"));
		int rowcount =  rows.size()-1;
		System.out.println("Count of Rows: "+rowcount);*/
		
		
		
		//Script to count No. of Columns in a HTML Table Row
		
       /* driver.get("https://www.railyatri.in/time-table");
		
		WebElement trains_table =  driver.findElement(By.className("timetable_table__4hbNj"));
		List<WebElement> rows = trains_table.findElements(By.tagName("tr"));
		
		List<WebElement> cols = rows.get(1).findElements(By.tagName("td"));
		int colcount =  cols.size();
		System.out.println("Count of Columns "+colcount);*/
		

		      /*  WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        driver.get("https://www.railyatri.in/time-table");
		       
		        WebElement trains_table = driver.findElement(By.cssSelector("table[class*='timetable_table']"));
		        List<WebElement> rows = trains_table.findElements(By.tagName("tr"));

				List<WebElement> cols = rows.get(1).findElements(By.tagName("td"));
				int colcount =  cols.size();
				System.out.println("Count of Columns "+colcount);*/
		
		
		
	/*	WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		
		driver.get("https://www.railyatri.in/time-table");
		
		WebElement trains_table =  driver.findElement(By.className("timetable_table__4hbNj"));
		List<WebElement> rows = trains_table.findElements(By.tagName("tr"));
		
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			String train_number = cols.get(0).getText();
			String train_name = cols.get(1).getText();
			System.out.println(train_number+"  "+train_name);	*/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		
		driver.get("https://www.railyatri.in/time-table");
		
		WebElement trains_table =  driver.findElement(By.className("timetable_table__4hbNj"));
		List<WebElement> rows = trains_table.findElements(By.tagName("tr"));
		
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for(WebElement element : cols)
			{
				String data = element.getText();
				System.out.println(data);
			}
		}
	}}
				        
		
	
		



	


