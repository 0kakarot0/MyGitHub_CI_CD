package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtils {
    private final WebDriver driver;
    private final WebDriverWait driverWait;

    public SeleniumUtils(WebDriver driver) {
        this.driver = driver;
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(120));
    }

    public void clickOnWebElement(By locator) {
        driver.findElement(locator).click();
    }

    public void enterValueInWebElement(By locator, String value) {
        driver.findElement(locator).sendKeys(value);
    }

    public void waitForWebElementToBeClickAble(By locator) {
        driverWait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForWebElementToBeVisible(By locator) {
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public String getAttribute(By locator, String attributeToGet) {
        return driver.findElement(locator).getAttribute(attributeToGet);
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }


}
