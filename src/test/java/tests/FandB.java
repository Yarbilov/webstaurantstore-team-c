package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InsideIndustrialSuppliesPage;

public class FandB {

    @Test
    public void test1() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.webstaurantstore.com/");

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[3]/nav/ul/li/div/a[8]")).click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Food & Beverages: Wholesale Food for Restaurants & More";
        Assert.assertEquals(actualTitle, expectedTitle);

        Thread.sleep(3000);
        driver.findElements(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div[1]/div[1]/div[1]/div/a/div[2]")).get(0).click();
        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "Wholesale Drinks: Bulk Beverages for Restaurants!";
        Assert.assertEquals(actualTitle1, expectedTitle1);

        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div[1]/div[2]/div/a/div[2]")).get(0).click();
        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Bulk Condiments & Sauces: Marinades, Spreads, & More";
        Assert.assertEquals(actualTitle2, expectedTitle2);

        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div[1]/div[3]/div/a/div[2]")).get(0).click();
        String actualTitle3 = driver.getTitle();
        String expectedTitle3 = "Bulk Baking Supplies: Wholesale Baking Ingredients";
        Assert.assertEquals(actualTitle3, expectedTitle3);

        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div[1]/div[4]/div/a/div[2]")).get(0).click();
        String actualTitle4 = driver.getTitle();
        String expectedTitle4 = "Wholesale Herbs & Spices: Shop Blends & Spices in Bulk";
        Assert.assertEquals(actualTitle4, expectedTitle4);

        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div/div/ul/li[1]/a/p")).get(0).click();
        String actualTitle5 = driver.getTitle();
        String expectedTitle5 = "Restaurant Supply Discounts, Sales, & Clearance";
        Assert.assertEquals(actualTitle5, expectedTitle5);

        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div/div/ul/li[2]/a/p")).click();
        String actualTitle6 = driver.getTitle();
        String expectedTitle6 = "Save on New Food Products at WebstaurantStore!";
        Assert.assertEquals(actualTitle6, expectedTitle6);

        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div/div/ul/li[3]/a/p")).click();
        String actualTitle7 = driver.getTitle();
        String expectedTitle7 = "WebstaurantPlus Food & Beverage Items - WebstaurantStore";
        Assert.assertEquals(actualTitle7, expectedTitle7);

    }
}
