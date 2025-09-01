package demo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryUI {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		
		driver.get("http://jqueryui.com");
		driver.findElement(By.linkText("Droppable")).click();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement srcelement,trgelement;
		srcelement = driver.findElement(By.id("draggable"));
		trgelement = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(srcelement, trgelement);
		act.build().perform();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Demos")).click();
		
		
	}}