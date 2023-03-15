package tests;

import com.sun.source.tree.AssertTree;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IndustrialSuppliesPage;
import pages.InsideIndustrialSuppliesPage;
import utils.Driver;

public class IndustrialSuppliesTests extends TestBase{


    @Test
    public void mainPageTest (){

        IndustrialSuppliesPage industrialSuppliesPage = new IndustrialSuppliesPage();
        industrialSuppliesPage.clickIndustrialLink();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.webstaurantstore.com/industrial-supplies.html");

    }

    @Test
    public void itemsSearch(){
        mainPageTest();
        InsideIndustrialSuppliesPage insidePage = new InsideIndustrialSuppliesPage();
        insidePage.lookForItems("tools");


        Assert.assertTrue(insidePage.getMessage().isDisplayed());



    }


}
