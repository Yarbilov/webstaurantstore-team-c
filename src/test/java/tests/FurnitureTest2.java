package tests;

import org.openqa.selenium.devtools.v85.systeminfo.model.Size;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FurniturePage2;
import pages.InsideFurniturePage2;
import utils.Driver;
import utils.SeleniumUtils;

public class FurnitureTest2 extends TestBase {

    @Test
    public void furnitureTest1() {
        FurniturePage2 furniturePage2 = new FurniturePage2();
        furniturePage2.clickfurnitureButton();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.webstaurantstore.com/restaurant-furniture.html");
    }

    @Test
    public void insideFurniturePage(){
        FurniturePage2 furniturePage2 = new FurniturePage2();
        furniturePage2.clickfurnitureButton();
        InsideFurniturePage2 page = new InsideFurniturePage2();
        page.clickhotelFurnitureButton();
        page.clickhotelMattressesButton();
        page.clickmattressPicked();
        new InsideFurniturePage2().clickSize();
        page.clickBuyButton();
        SeleniumUtils.waitFor(5);
        page.clickViewCartButton();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.webstaurantstore.com/cart/");


    }
}

