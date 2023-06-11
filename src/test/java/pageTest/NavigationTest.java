package pageTest;

import org.testng.annotations.Test;
import pageObjects.NavigationPage;

public class NavigationTest extends BaseTest {
    NavigationPage navigationPage = new NavigationPage();

    @Test
    public void testNavigation(){
        navigationPage.click_Shop_Products_And_Color();
        navigationPage.hover_Homeowner_Paints_Stains_And_Supplies();
        navigationPage.navigate_To_Home_Interiors_Paint();
    }
}
