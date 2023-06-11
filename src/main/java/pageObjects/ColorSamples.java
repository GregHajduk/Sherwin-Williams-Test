package pageObjects;

import org.openqa.selenium.By;

public class ColorSamples extends BasePage {

    private By scrollToPoint = By.xpath("//h1[contains(text(), 'Explore the color wall')]");
    private By searchFieldButton = By.xpath("//button[@data-testid='search-btn']");
    private By searchFieldInput = By.id("SearchBarInput75");
    private By paintSwatch = By.xpath("//div[@data-testid='inner-swatch-undefined']");
    public void close_Pop_Up() throws InterruptedException {
        switch_To_Tab();
        Thread.sleep(5000);
        clickOnCurrentlyActive();
    }

    public void open_Search_Field(){
        scrollElementIntoView(scrollToPoint);
        waitForElementVisible(searchFieldButton);
        click(searchFieldButton);
    }

    public void enter_Searched_Color(String color) {
        setText(searchFieldInput, color);
    }

    public String get_Swatch_Text(){
        waitForElementVisible(paintSwatch);
        return getText(paintSwatch);
    }
}
