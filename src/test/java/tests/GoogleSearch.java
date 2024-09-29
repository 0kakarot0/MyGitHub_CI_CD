package tests;

import base.DriverManager;
import base.TestBase;
import org.testng.annotations.Test;
import pages.Search_In_Google;

public class GoogleSearch extends TestBase {
    @Test
    private void searchInGoogle() {
        Search_In_Google searchInGoogle = new Search_In_Google(DriverManager.getDriver());

        searchInGoogle.enterSearchQuery("Selenium");

        searchInGoogle.clickOnGoogleImage();

        searchInGoogle.clickOnSearchButton();
    }
}
