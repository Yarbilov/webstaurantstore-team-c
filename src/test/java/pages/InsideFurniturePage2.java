package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import tests.BaseTest;
import tests.TestBase;
import utils.ConfigReader;
import utils.Driver;

public class InsideFurniturePage2 extends TestBase {

    public InsideFurniturePage2(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div/div/div[1]/div[3]/div[3]/div/a/div[2]")
    private WebElement hotelFurnitureButton;
    public void clickhotelFurnitureButton(){hotelFurnitureButton.click();}

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div[1]/div/ul/li[2]/a/h3")
    private WebElement hotelMattressesButton;
    public void clickhotelMattressesButton(){hotelMattressesButton.click();}

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/div[2]/div[3]/div[1]/div[2]/a")
    private WebElement mattressPicked;
    public void clickmattressPicked(){mattressPicked.click();}

    @FindBy(id = "Size")
    private WebElement size;
    public void clickSize(){new Select(size).selectByVisibleText("Twin");}

    @FindBy(id = "buyButton")
    private WebElement buyButton;
    public void clickBuyButton(){buyButton.click();}

    @FindBy(xpath = "//*[@id=\"subject\"]/div[2]/div/a[1]/button")
    private WebElement viewCartButton;
    public void clickViewCartButton(){viewCartButton.click();}

}

