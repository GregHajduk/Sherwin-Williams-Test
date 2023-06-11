package pageObjects;

import org.openqa.selenium.By;

public class ColorPage extends BasePage {
    private By fullDetailsArrow = By.xpath("(//i)[2]");
    private By colorSampleIcon = By.xpath("(//div[text()='Color Sample']/..)[2]");
    private By colorSampleName = By.xpath("//div[@class='cdp-hero__right-container']//h1");
    private By ColorHexCode = By.xpath("//span[contains(text(), 'Hex Value:')]/..");

    public String get_The_URL() {
        switch_To_Tab();
        return getPageURL();
    }

    public void open_URL_In_New_Tab(String url) {
        openNewTab();
        switch_To_Tab();
        goToUrl(url);
        closeCookiePolicy();
    }

    public void open_Full_Details() {
        waitForElementVisible(fullDetailsArrow);
        click(fullDetailsArrow);
    }

    public String get_Color_Name_To_Assert() {
        return getText(colorSampleName);
    }

    public String get_HexCode_To_Assert() {
        return getText(ColorHexCode);
    }

    public void click_Color_Sample_Icon() {
        click(colorSampleIcon);
    }
}
