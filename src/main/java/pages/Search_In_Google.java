package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import utils.SeleniumUtils;

public class Search_In_Google extends SeleniumUtils {
    private final By searchFieldLocator = By.name("q");
    private final By googleSearchButtonLocator
            = RelativeLocator.with(By.xpath("//input[@value=\"Google Search\"]")).above(By.xpath("//input[@value=\"I'm Feeling Lucky\"]"));

    public Search_In_Google(WebDriver driver) {
        super(driver);
    }

    public void enterSearchQuery(String searchQuery) {
        waitForWebElementToBeClickAble(searchFieldLocator);
        clickOnWebElement(searchFieldLocator);
        enterValueInWebElement(searchFieldLocator, searchQuery);
    }

    public void clickOnSearchButton() {
        waitForWebElementToBeClickAble(googleSearchButtonLocator);
        clickOnWebElement(googleSearchButtonLocator);
    }
}
