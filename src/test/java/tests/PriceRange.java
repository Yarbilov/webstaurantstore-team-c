package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import java.util.concurrent.TimeUnit;



import org.w3c.dom.html.HTMLInputElement;

public class PriceRange {
    private WebDriver driver;
    private HTMLInputElement filterButton;

    @BeforeTest
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

//    @AfterTest
//    public void tearDown() {
//        driver.quit();
//    }

    @Test
    public void testPriceRangeFilter() throws IOException, InterruptedException {
        // Step 1: Navigate to the Search Results Page
        Thread.sleep(6000);
        driver.get("https://www.webstaurantstore.com/");
        Thread.sleep(5000);
        WebElement searchBox = driver.findElement(By.name("searchval"));
        searchBox.sendKeys("chef knives");
        searchBox.submit();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"categoriesBox\"]/div[2]/a/div/div/img")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"panel-1\"]/a[2]/div[1]/img")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("sort_options")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"sort_options\"]/optgroup[1]/option[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"sort_options\"]/optgroup[1]/option[2]")).click();
        Thread.sleep(5000);




    }

    }


