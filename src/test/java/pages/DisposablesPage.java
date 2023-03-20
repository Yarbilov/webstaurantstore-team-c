package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import utils.Driver;

import java.time.Duration;


public class DisposablesPage {

    @Test
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.webstaurantstore.com/");
        WebElement DisposablesPage = driver.findElement(By.xpath("//a[@href='/disposables/c1705.html']"));
       DisposablesPage.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
