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
    @FindBy(xpath="//img[contains(@src,'slides')]")
    private WebElement firstImage;
    @FindBy(xpath="//div[@ id='ProductBoxContainer']")
    private List<WebElement> product_listing;
    @FindBy(xpath="//div[@class='banner-pager']//span[2]")
    private WebElement secondButton;
    @FindBy(xpath="//img[@alt='Create, make & bake with the ingredients preferred by professionals']")
    private WebElement secondImage;
    @FindBy(xpath="//div[@class='banner-pager']//span[3]")
    private WebElement thirdButton;
    @FindBy(xpath="//img[@alt='Cold Brew Coffee & Equipment ']")
    private WebElement thirdImage;
    @FindBy(xpath="//div[@class='banner-pager']//span[4]")
    private WebElement fourthButton;
    @FindBy(xpath="//img[@alt='Take-Out Containers ']")
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
