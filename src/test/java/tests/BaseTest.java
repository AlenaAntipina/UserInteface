package tests;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import data.InternetPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    protected static Browser browser;

    @BeforeClass
    public void setUp(){
        browser = AqualityServices.getBrowser();
        browser.maximize();
        browser.goTo(InternetPage.LOGIN.getAddress());
        browser.waitForPageToLoad();
    }

    @AfterClass
    public void tearDown(){
        browser.quit();
    }
}
