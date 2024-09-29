package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TestBase {
    private WebDriver driver = null;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        driver = DriverManager.getDriver();
        URL url = new URL("https://www.google.com/");
        driver.get(String.valueOf(url));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
    }

    @AfterClass
    public void tearDown() throws UnsupportedOperationException {
        DriverManager.getDriver().quit();
    }
}
