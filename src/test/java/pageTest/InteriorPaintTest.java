package pageTest;

import org.testng.annotations.Test;
import pageObjects.InteriorPaintPage;

public class InteriorPaintTest extends BaseTest {
    InteriorPaintPage interiorPaintPage = new InteriorPaintPage();

    @Test
    public void search_For_Tuberose_Paint_Color() {
        interiorPaintPage.search_For_Paint_Color("tuberose paint");
    }

    @Test
    public void navigate_To_Paint_Color_Page() {
        interiorPaintPage.navigate_To_Tuberose_Paint_Color_Page();
    }
}

