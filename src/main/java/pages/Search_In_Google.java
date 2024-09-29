package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumUtils;

public class Search_In_Google extends SeleniumUtils {
    private final By searchFieldLocator = By.name("q");
    private final By googleImageLocator = By.xpath("/html/body/div[1]/div[2]/div/img");
    private final By googleSearchButtonLocator = By.xpath("(//*[@value=\"Google Search\" and @type=\"submit\"])[2]");

    public Search_In_Google(WebDriver driver) {
        super(driver);
    }

    public void enterSearchQuery(String searchQuery) {
        waitForWebElementToBeClickAble(searchFieldLocator);
        clickOnWebElement(searchFieldLocator);
        enterValueInWebElement(searchFieldLocator, searchQuery);
    }

    public void clickOnGoogleImage() {
        waitForWebElementToBeClickAble(googleImageLocator);
        clickOnWebElement(googleImageLocator);
    }

    public void clickOnSearchButton() {
        waitForWebElementToBeClickAble(googleSearchButtonLocator);
        clickOnWebElement(googleSearchButtonLocator);
    }
}
