package tests;

import com.sun.source.tree.AssertTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IndustrialSuppliesPage;
import pages.InsideIndustrialSuppliesPage;
import utils.Driver;

import java.util.Arrays;
import java.util.List;

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
    @Test
    public void itemsSize(){
        itemsSearch();
        InsideIndustrialSuppliesPage insidePage = new InsideIndustrialSuppliesPage();
        List<WebElement> list = insidePage.getList();
        Assert.assertEquals(list.size(),31);
    }


}
