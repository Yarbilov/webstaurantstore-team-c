package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Driver;

public class DynamicBannersTests extends TestBase{


    @Test
    public void testButton1()  {

        new HomePage().click1Button();
        new HomePage().click1Image();
        Assert.assertEquals(Driver.getDriver().getTitle(),"Torani Purees, Syrups, & Smoothie Mixes - WebstaurantStore");
    }

    @Test
    public void testButton2()  {

        new HomePage().click2Button();
        new HomePage().click2Image();
        Assert.assertEquals(Driver.getDriver().getTitle(),"Bulk Chocolate - WebstaurantStore");

    }

    @Test
    public void testButton3()  {

        new HomePage().click3Button();
        new HomePage().click3Image();
        Assert.assertEquals(Driver.getDriver().getTitle(),"Cold Brew Coffee & Equipment - WebstaurantStore");

    }

    @Test
    public void testButton4()  {

        new HomePage().click4Button();
        new HomePage().click4Image();
        Assert.assertEquals(Driver.getDriver().getTitle(),"Choice Take-Out Containers - WebstaurantStore");
        new HomePage().clickHomePageLogo();
    }

    @Test
    public void testFirstElementList() {

        new HomePage().click1Button();
        new HomePage().click1Image();
        int actualAmount=new HomePage().getProduct_listing().size();
        int expectedAmount=60;
        Assert.assertEquals(actualAmount,expectedAmount);

    }

    @Test
    public void testSecondElementList() {

        new HomePage().click2Button();
        new HomePage().click2Image();
        int actualAmount=new HomePage().getProduct_listing().size();
        int expectedAmount=60;
        Assert.assertEquals(actualAmount,expectedAmount);

    }

    @Test
    public void testThirdElementList() {

        new HomePage().click3Button();
        new HomePage().click3Image();
        int actualAmount=new HomePage().getProduct_listing().size();
        int expectedAmount=28;
        Assert.assertEquals(actualAmount,expectedAmount);

    }

    @Test
    public void testFourthElementList() {

        new HomePage().click4Button();
        new HomePage().click4Image();
        int actualAmount=new HomePage().getProduct_listing().size();
        int expectedAmount=52;
        Assert.assertEquals(actualAmount,expectedAmount);

    }
    }
