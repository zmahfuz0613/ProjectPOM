package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestUtil extends TestBase {
    public void navigateTo(String URL) {
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    private WebElement waitForElement(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }


    public void clickSignIn(By element) {
        WebElement localElement = waitForElement(element);
        localElement.click();
    }

    //LoginPage functions

    public void insertUserName(By element, String text) {
        WebElement localElement = waitForElement(element);
        localElement.sendKeys(text);
    }

    public void insertPassword(By element, String text) {
        WebElement localElement = waitForElement(element);
        localElement.sendKeys(text);
    }

    public void clickLogin(By element) {
        WebElement localElement = waitForElement(element);
        localElement.click();
    }
}
