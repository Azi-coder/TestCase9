package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchTest extends BaseTest{

    @Test
    public void testTrials(){
        assertEquals(homePage.getText(), "Full-Fledged practice website for Automation Engineers", "Homepage is not opened properly");
        homePage.clickProductButton();
        assertEquals(productsPage.getText(),"ALL PRODUCTS","Product page error");
        productsPage.sendText("Men");
        productsPage.clickSearch();
        Assert.assertTrue(resultPage.getText().contains("Men"));
    }
}
