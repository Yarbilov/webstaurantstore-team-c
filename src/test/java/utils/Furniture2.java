package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Driver;

import java.time.Duration;

public class Furniture2 {


    @Test

    public void test() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();

        driver.get("https://www.webstaurantstore.com/");
        driver.findElement(By.xpath("//a[ contains( . , 'Furniture' )]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div[1]/div[1]/div[1]/div/a/div[1]/img")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div[1]/div[1]/div[2]/div/a/div[1]/img")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div[1]/div[1]/div[3]/div/a/div[1]/img")).click();
        Thread.sleep(5000);

    }
}


