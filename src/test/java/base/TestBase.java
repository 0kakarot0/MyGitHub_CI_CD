package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TestBase {

    @BeforeClass
    public void setUp() throws MalformedURLException {
        URL url = new URL("https://www.google.com/");
        DriverManager.getDriver().get(String.valueOf(url));
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(300));
    }

    @AfterClass
    public void tearDown() throws UnsupportedOperationException {
        DriverManager.getDriver().quit();
    }
}
