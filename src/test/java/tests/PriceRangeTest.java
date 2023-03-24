package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PriceRangePage;
import utils.Driver;

public class PriceRangeTest extends TestBase {

    @Test
    public void testFirstItem() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Chef Knives - WebstaurantStore");


    }

    @Test
    public void testChefKnives() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }

    @Test
    public void testJapaneseSteel() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        new PriceRangePage().clickOnJapaneseSteelKnives();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }

    @Test

    public void testSortOption(){
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        new PriceRangePage().clickOnJapaneseSteelKnives();
        new PriceRangePage().clickOnSortOption();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }

    @Test

    public void testSortOptionByPriceLowToHigh(){
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        new PriceRangePage().clickOnJapaneseSteelKnives();
        new PriceRangePage().clickOnSortOption();
        new PriceRangePage().clickOnSortOptionByPriceLowToHigh();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }

    @Test

    public void testSortOptionByPriceHighToLow(){
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        new PriceRangePage().clickOnJapaneseSteelKnives();
        new PriceRangePage().clickOnSortOption();
        new PriceRangePage().clickOnSortOptionByPriceHighToLow();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }



}
