package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    // Locators
    By username = By.id("user-name");
    By password = By.id("password");

    // After login
    By productsTitle = By.className("title");
    By loginButton = By.id("login-button");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void openWebsite() {
        driver.get("https://www.saucedemo.com");
    }
    
    public void loginToApplication() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys("standard_user");
        driver.findElement(password).sendKeys("secret_sauce");
        driver.findElement(loginButton).click();
    }
    
    public void waitForProductsPage() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(productsTitle));
    }

    public void waitForPageLoad() {

        //  EXACT PLACE OF EXPLICIT WAIT (BEST PRACTICE)
    	wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
    }
}