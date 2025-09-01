package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class gmaillogin {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // System.setProperty("webdriver.edge.driver", "msedgedriver.exe"); // Uncomment if needed
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testGmailLogin() {
        driver.get("https://mail.google.com/");

        // Enter email
        WebElement emailField = driver.findElement(By.id("identifierId"));
        emailField.sendKeys("samplemailmone@gmail.com");
        driver.findElement(By.id("identifierNext")).click();

        // Wait for password field to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement password = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']"))
        );

        // Enter password
        password.sendKeys("samplemailmone@24");
        driver.findElement(By.id("passwordNext")).click();

        // Wait and verify inbox page loaded (title contains Inbox)
        wait.until(ExpectedConditions.titleContains("Inbox"));

        Assert.assertTrue(driver.getTitle().contains("Inbox"),
                "Login unsuccessful or Inbox not found");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
