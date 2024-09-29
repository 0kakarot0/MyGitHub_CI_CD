package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver != null) {
            driver = new ChromeDriver();
            return driver;
        } else {
            return null;
        }

    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }

}
