package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Furniture1;
import pages.FurniturePage;
import utils.Driver;

public class FurnitureTests3 {



    @Test

    public void testFurniture1() throws InterruptedException {
        new Furniture1().test();
        new FurniturePage().test();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Furniture ");

    }

    @Test
    public void testFurniture2() throws InterruptedException {
        new FurniturePage().toString();
        new FurniturePage().test();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Chairs ");

    }

    @Test
    public void testFurniture3() throws InterruptedException {
        new FurniturePage().test();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Bar Stools ");

    }

    @Test
    public void testFurniture4() throws InterruptedException {
        new FurniturePage().test();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Restaurant Tables ");

    }

    @Test
    public void testFurniture5() throws InterruptedException {
        new FurniturePage().test();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Restaurant Booths ");

    }

    @Test

    public void testFurniture6() throws InterruptedException {
        new FurniturePage().test();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Restaurant Benches ");

    }

    @Test

    public void testFurniture8() throws InterruptedException {
        new FurniturePage().test();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Restaurant Chairs ");

    }

    @Test
    public void testFurniture9() throws InterruptedException {
        new FurniturePage().test();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Restaurant Tables ");

    }

}
