package pageTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ColorPage;

import static org.testng.Assert.assertEquals;

public class ColorTest extends BaseTest {
    ColorPage colorPage = new ColorPage();

    String expectedUrl = "https://www.sherwin-williams.com/en-us/color/color-family/red-paint-colors/SW6578-tuberose";
    String expectedProductName = "SW 6578\nTuberose";
    String expectedHexCode = "Hex Value: #D47C8C";

    @Test
    public void check_The_URL() {
        String url = colorPage.get_The_URL();
        assertEquals(url, expectedUrl);
    }

    @Test
    public void open_Tuberose_Paint_Color_In_New_Tab() {
        colorPage.open_URL_In_New_Tab(expectedUrl);
    }

    @Test
    public void verify_Product_Name() {
        colorPage.open_Full_Details();
        String extractedProductNameColor = colorPage.get_Color_Name_To_Assert();
        Assert.assertEquals(extractedProductNameColor, expectedProductName, "Product Name NOT matching the expected one");
    }

    @Test
    public void verify_Hex_Code() {
        String extractedHexCode = colorPage.get_HexCode_To_Assert();
        Assert.assertEquals(extractedHexCode, expectedHexCode, "Hex Code NOT matching the expected one");
    }

    @Test
    public void test_Icon_Navigation() throws InterruptedException {
        Thread.sleep(5000);
        colorPage.click_Color_Sample_Icon();

    }
}

