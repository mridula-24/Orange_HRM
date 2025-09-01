package ohrm.liabrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String uid, String pwd) {
        driver.findElement(By.id("txtUsername")).sendKeys(uid);
        driver.findElement(By.id("txtPassword")).sendKeys(pwd);
        driver.findElement(By.id("btnLogin")).click();
    }

    public void logout() {
        try {
            driver.findElement(By.partialLinkText("Welcome")).click();
            driver.findElement(By.linkText("Logout")).click();
        } catch (Exception e) {
            System.out.println("Logout not possible (probably login failed): " + e.getMessage());
        }
    }

    public boolean isAdminModuleDisplayed() {
        try {
            return driver.findElement(By.linkText("Admin")).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isErrMsgDisplayed() {
        try {
            return driver.findElement(By.id("spanMessage")).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
