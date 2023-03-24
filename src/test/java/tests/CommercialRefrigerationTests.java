package tests;

import com.sun.source.tree.AssertTree;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CommercialRefrigeration;
import pages.IndustrialSuppliesPage;
import pages.InsideCommercialRefrigeration;
import pages.InsideIndustrialSuppliesPage;
import utils.Driver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class CommercialRefrigerationTests extends TestBase {

    @Test (groups = {"smoke"})
    public void mainPageTest (){

        CommercialRefrigeration commercialRefrigeration = new CommercialRefrigeration();
        commercialRefrigeration.clickCommercialRefrigerationLink();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.webstaurantstore.com/refrigeration-equipment.html");

    }

    @Test
    public void itemsSearch(){
        mainPageTest();
        InsideCommercialRefrigeration insidePage = new InsideCommercialRefrigeration();
        insidePage.lookForItems("Reach-In");
        Assert.assertTrue(insidePage.getMessage().isDisplayed());
    }
    @Test
    public void itemsSize(){
        itemsSearch();
        InsideCommercialRefrigeration insidePage = new InsideCommercialRefrigeration();
        List<WebElement> list = insidePage.getList();
        int numberItems = insidePage.getList().size();
        Assert.assertEquals(list.size(),numberItems);

    }

    @DataProvider
    public Object[][] getData(){

        return new Object[][] {
                {"Reach-In"},
                {"Merchandising"},
                {"Prep"},
        };

    }

    @Test (dataProvider = "getData")
    public void testSearch(String searchTerm){
        mainPageTest();
        new InsideCommercialRefrigeration().lookForItems(searchTerm);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(searchTerm));
    }

}
