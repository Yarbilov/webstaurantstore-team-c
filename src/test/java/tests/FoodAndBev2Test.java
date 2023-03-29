package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FoodAndBev2Page;
import utils.Driver;
import utils.SeleniumUtils;

public class FoodAndBev2Test extends TestBase {

    @Test
    public void FoodAndBevTest1() {
        FoodAndBev2Page FandB = new FoodAndBev2Page();
        FandB.clickFoodAndBevButton();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.webstaurantstore.com/restaurant-consumables.html");
        FandB.clickDairyButton();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.webstaurantstore.com/54655/dairy.html");
        FandB.clickMilkAndCreamButton();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.webstaurantstore.com/55105/milk.html");
        FandB.clickMilkButton();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.webstaurantstore.com/55105/milk.html?filter=type:milk");
        FandB.clickMilkSelected();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.webstaurantstore.com/organic-valley-half-gallon-organic-whole-milk-case/874RE333098.html");
        FandB.clickBuyButton();
        SeleniumUtils.waitFor(5);
        FandB.clickViewCartButton();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.webstaurantstore.com/cart/");


    }
}