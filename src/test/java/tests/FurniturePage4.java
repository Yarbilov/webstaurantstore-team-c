package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FurniturePage;
import utils.Driver;

public class FurniturePage4  extends BaseTest{


    @Test
    public void testFurniture() throws InterruptedException {
        new FurniturePage().test();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Furniture ");
    }

    @Test
    public void testFurniture1() throws InterruptedException {
        new FurniturePage().test();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hotel furniture");
    }
    @Test
    public void testFurniture2() throws InterruptedException {
        new FurniturePage().test();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hotel Mattress");
    }
    @Test
    public void testFurniture3() throws InterruptedException {
        new FurniturePage().test();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Hotel Bedding");
    }
    @Test

    public void testFurniture4() throws InterruptedException {
        new FurniturePage().test();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Waterproof Mattress Protector");
    }





}



