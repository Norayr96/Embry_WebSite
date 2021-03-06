//Section - Forget about standing on your scale

package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.main.Section_Pfqlg;

public class Section_Pfqlg_Tests extends BaseTest {

    @BeforeMethod
    void openPage() {
        navigateToURI("");
    }

    @Test
    public void tc_1() {
        Section_Pfqlg section_pfqlg = new Section_Pfqlg();
        Assert.assertTrue(section_pfqlg.isSectionContainsTexts());
    }

    @Test
    public void tc_2() {
        Section_Pfqlg section_pfqlg = new Section_Pfqlg();
        Assert.assertTrue(section_pfqlg.isAllDesiredResultsShown());
    }

    @Test
    public void tc_3() {
        Section_Pfqlg section_pfqlg = new Section_Pfqlg();
        section_pfqlg.clickOnBuyNowBtn();
        Assert.assertTrue(section_pfqlg.isSectionDisplayed());
    }
}
