package pageTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pageObjects.BasePage;

public class BaseTest extends BasePage {
    @BeforeSuite
    public void setUp() {
        goToHomepage();
    }

    @AfterSuite
    public void tearDown() {
        closeBrowser();
    }
}
