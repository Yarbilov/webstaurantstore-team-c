package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CommercialRefrigeration;
import pages.InsideCommercialRefrigeration;
import utils.Driver;
import utils.SeleniumUtils;
import java.util.List;

public class CommercialRefrigerationTests extends TestBase {

    @Test (groups = {"smoke"})
    public void mainPageTest (){

        CommercialRefrigeration commercialRefrigeration = new CommercialRefrigeration();
        commercialRefrigeration.clickCommercialRefrigerationLink();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.webstaurantstore.com/refrigeration-equipment.html");

    }

    @Test (groups = {"smoke"})
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

    @DataProvider()
    public Object[][] getData(){

        return new Object[][] {
                {"Reach-In Refrigerators"},
                {"Merchandising"},
                {"Prep"},
                {"Bar Refrigeration"},
                {"Refrigerated Display Cases"},
                {"Ice Machines"},
                {"Commercial Ice Cream Freezers"},
                {"Walk-In Refrigeration"},
                {"Undercounter"},
                {"Commercial Blast Chillers"}
        };

    }

    @Test (dataProvider = "getData")
    public void testSearch(String searchTerm){
        mainPageTest();
        new InsideCommercialRefrigeration().lookForItems(searchTerm);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(searchTerm));
    }

    @Test (groups = {"smoke"})
    public void scrollPage(){
        mainPageTest();
        SeleniumUtils.scroll(10000,500);
    }

    @Test
    public void scrollToElement() {
        mainPageTest();
        SeleniumUtils.scrollToElement(new InsideCommercialRefrigeration().getFooterPrivacy());

    }

}
