package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Furniture1connectedToFurniture {

    @Test
    public void test() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.webstaurantstore.com/");

        driver.findElement(By.xpath("//a[ contains( . , 'Furniture' )]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div[1]/div[1]/div[2]/div/a/div[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div[1]/div[1]/div[1]/div[3]/div/a/div[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"details\"]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"gallery\"]/div[1]/div[2]/ul/li[4]/a/img")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"gallery\"]/div[1]/div[2]/ul/li[5]/a/img")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"gallery\"]/div[1]/div[2]/ul/li[6]/a/img")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/div[2]/div/div[3]/div/div/img")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"buyButton\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/div[2]/div/div[3]/div/div/div[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"subject\"]/div[2]/div/a[2]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"email-login\"]")).click();
        Thread.sleep(5000);


    }

}



