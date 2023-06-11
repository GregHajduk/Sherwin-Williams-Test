package pageObjects;

import org.openqa.selenium.By;

public class InteriorPaintPage extends BasePage {
    private By searchBox = By.xpath("//input[@id='SimpleSearchForm_SearchTerm']");
    private By tuberosePaint = By.xpath("//span[contains(text(), 'SW 6578')]/../../..");

    public void search_For_Paint_Color(String color) {
        waitForElementVisible(searchBox);
        setText(searchBox, color);
    }

    public void navigate_To_Tuberose_Paint_Color_Page() {
        waitForElementVisible(tuberosePaint);
        click(tuberosePaint);

    }
}
