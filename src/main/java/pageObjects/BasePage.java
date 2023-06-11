package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class BasePage {

    protected static WebDriver driver;
    public String baseUrl = "https://www.sherwin-williams.com/";
    private By cookiePolicyRejectButton = By.id("ensRejectBanner");

    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        driver.quit();
    }

    public Boolean goToHomepage() {
        try {
            openBrowser();
            driver.get(baseUrl);
        } catch (Exception e) {
            System.out.println("Unable to navigate to the homepage");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void setText(By locator, String text) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
        tab(locator);
    }

    public void clickOnCurrentlyActive() {
        WebElement activeElement = driver.switchTo().activeElement();
        activeElement.click();
    }

    public void tab(By locator) {
        driver.findElement(locator).sendKeys(Keys.TAB);
    }

    public void openNewTab() {
        driver.switchTo().newWindow(WindowType.TAB);
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void closeCookiePolicy() {
        driver.findElement(cookiePolicyRejectButton).click();
    }

    public void switch_To_Tab() {
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
    }

    public void goToUrl(String url) {
        driver.get(url);
    }

    public String getPageURL() {
        return driver.getCurrentUrl();
    }


    public void waitForElementVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void hoverOverElement(By locator) {
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void scrollElementIntoView(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();", element);
    }


}