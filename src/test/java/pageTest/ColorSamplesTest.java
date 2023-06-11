package pageTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ColorSamples;

public class ColorSamplesTest extends BaseTest {
    ColorSamples colorSamples = new ColorSamples();
    String testColor = "tuberose";
    String expectedSwatchInnerText = "SW 6578\n\nTuberose\n\nOrder samples";

    @Test
    public void close_Pop_Up_Modal() throws InterruptedException {
        colorSamples.close_Pop_Up();
    }

    @Test
    public void verify_Swatch_Details() {
        closeCookiePolicy();
        colorSamples.open_Search_Field();
        colorSamples.enter_Searched_Color(testColor);
        String sampleText = colorSamples.get_Swatch_Text();
        Assert.assertEquals(sampleText, expectedSwatchInnerText,"Swatch Details verification did NOT pass");
    }
}
