package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Driver;

import java.util.List;

public class HomePage {


    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);//initialize everything that has @FindBy annotation
    }

    @FindBy(xpath="//div[@class='banner-pager']//span[1]")
    private WebElement firstButton;
    @FindBy(xpath="//img[@alt='Shop 10% Off Ghirardelli Chips, Cocoas, Wafers, and More']")
    private WebElement firstImage;
    @FindBy(xpath="//div[@ id='ProductBoxContainer']")
    private List<WebElement> product_listing;
    @FindBy(xpath="//div[@class='banner-pager']//span[2]")
    private WebElement secondButton;
    @FindBy(xpath="//img[@alt='Shop Bobrick Restroom Replacements For a Sanitary Establishment']")
    private WebElement secondImage;
    @FindBy(xpath="//div[@class='banner-pager']//span[3]")
    private WebElement thirdButton;
    @FindBy(xpath="//img[@alt='Great Value on Cambro Pro Cart Ultra® Holding Cabinets to Transport Food Safely']")
    private WebElement thirdImage;
    @FindBy(xpath="//div[@class='banner-pager']//span[4]")
    private WebElement fourthButton;
    @FindBy(xpath="//img[@alt='Take 15% OFF Capora Beverage Mixes & Flavoring Sauces for Decadent Desserts & Drinks ']")
    private WebElement fourthImage;
    @FindBy(xpath="//a[@aria-label='WebstaurantStore']")
    private WebElement homePageLogo;

    public void clickHomePageLogo(){
        homePageLogo.click();
    }
    public void click1Button(){
        firstButton.click();
    }
    public void click2Button(){
        secondButton.click();
    }
    public void click1Image(){
        firstImage.click();
    }
    public void click2Image(){
        secondImage.click();
    }
    public void click3Button(){
        thirdButton.click();
    }
    public void click3Image(){
        thirdImage.click();
    }
    public void click4Button(){
        fourthButton.click();
    }
    public void click4Image(){
        fourthImage.click();
    }

    public List<WebElement> getProduct_listing() {
        return product_listing;
    }

}
