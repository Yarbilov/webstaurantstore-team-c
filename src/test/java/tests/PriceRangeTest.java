package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.PriceRangePage;
import utils.Driver;
import static org.testng.Assert.assertEquals;

import utils.SeleniumUtils;

public class PriceRangeTest extends TestBase {

    @Test
    public void testFirstItem() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        assertEquals(Driver.getDriver().getTitle(), "Chef Knives - WebstaurantStore");


    }

    @Test
    public void testChefKnives() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }

    @Test
    public void testJapaneseSteel() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        new PriceRangePage().clickOnJapaneseSteelKnives();
        assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }

    @Test
    public void testSortOption() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        new PriceRangePage().clickOnJapaneseSteelKnives();
        new PriceRangePage().clickOnSortOption();
        assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }

    @Test
    public void testSortOptionByPriceLowToHigh() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        new PriceRangePage().clickOnJapaneseSteelKnives();
        new PriceRangePage().clickOnSortOption();
        new PriceRangePage().clickOnSortOptionByPriceLowToHigh();
        assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }

    @Test

    public void testSortOptionByPriceHighToLow() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        new PriceRangePage().clickOnJapaneseSteelKnives();
        new PriceRangePage().clickOnSortOption();
        new PriceRangePage().clickOnSortOptionByPriceHighToLow();
        assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }

    @Test

    public void testSortOptionByRatingLowToHigh() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        new PriceRangePage().clickOnJapaneseSteelKnives();
        new PriceRangePage().clickOnSortOption();
        assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }

    @Test

    public void testSortOptionByRatingHighToLow() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        new PriceRangePage().clickOnJapaneseSteelKnives();
        new PriceRangePage().clickOnSortOption();
        assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }

    @Test

    public void testSortOptionByNewest() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        new PriceRangePage().clickOnJapaneseSteelKnives();
        new PriceRangePage().clickOnSortOption();
        assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }

    @Test

    public void testSortOptionByOldest() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        new PriceRangePage().clickOnJapaneseSteelKnives();
        new PriceRangePage().clickOnSortOption();
        assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }

    @Test

    public void testChooseItem() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        new PriceRangePage().clickOnJapaneseSteelKnives();
        new PriceRangePage().clickOnSortOption();
        new PriceRangePage().clickOnSortOptionByPriceLowToHigh();
        new PriceRangePage().clickOnChooseItem();
        assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }

    @DataProvider(name = "data-provider")

    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {"chef knives"},
                {"chef knife"},
                {"chef knife set"}
        };

    }

    @Test

    public void testAddToCartChosenItem() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        new PriceRangePage().clickOnJapaneseSteelKnives();
        new PriceRangePage().clickOnSortOption();
        new PriceRangePage().clickOnSortOptionByPriceLowToHigh();
        new PriceRangePage().clickOnChooseItem();
        new PriceRangePage().clickOnAddToCartChosenItem();
        assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }

    @Test

    public void testClickOnCart() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        new PriceRangePage().clickOnJapaneseSteelKnives();
        new PriceRangePage().clickOnSortOption();
        new PriceRangePage().clickOnSortOptionByPriceLowToHigh();
        new PriceRangePage().clickOnChooseItem();
        new PriceRangePage().clickOnAddToCartChosenItem();
        assertEquals(Driver.getDriver().getTitle(), "Chef Knives: 200+ Professional Chef Knives at Low Prices!");
    }

    @Test

    public void testopenCheckoutPage() {
        new PriceRangePage().clickOnSearchBox();
        new PriceRangePage().sendKeysToSearchBox("chef knives");
        new PriceRangePage().clickOnSubmit();
        new PriceRangePage().clickOnChefKnives();
        new PriceRangePage().clickOnJapaneseSteelKnives();
        new PriceRangePage().clickOnSortOption();
        new PriceRangePage().clickOnSortOptionByPriceLowToHigh();
        new PriceRangePage().clickOnChooseItem();
        new PriceRangePage().clickOnAddToCartChosenItem();
        new PriceRangePage().clickOnCart();
        new PriceRangePage().clickOnOpenCheckoutPage();
        assertEquals(Driver.getDriver().getTitle(), "Chef Knives - WebstaurantStore");




    }


}