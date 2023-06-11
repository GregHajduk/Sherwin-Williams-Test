package pageObjects;

import org.openqa.selenium.By;

public class NavigationPage extends BasePage {
    private By shop_Products_And_Color = By.xpath("//span[contains(text(), 'Shop Products & Color')]");
    private By homeowner_Paints_Stains_And_Supplies = By.xpath("//button[contains(text(), 'Homeowner Paints, Stains & Supplies')]");
    private By paint_On_Home_Interiors = By.xpath("//span[text()='Paint' and @itemprop='name']");

    public void click_Shop_Products_And_Color() {
        click(shop_Products_And_Color);
    }

    public void hover_Homeowner_Paints_Stains_And_Supplies() {
        hoverOverElement(homeowner_Paints_Stains_And_Supplies);
    }

    public void navigate_To_Home_Interiors_Paint() {
        click(paint_On_Home_Interiors);
    }

}
