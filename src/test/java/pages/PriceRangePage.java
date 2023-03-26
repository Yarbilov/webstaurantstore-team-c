package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;

import java.util.List;

public class PriceRangePage {

    public PriceRangePage() {


        PageFactory.initElements(Driver.getDriver(), this);//initialize everything that has @FindBy annotation
    }


    @FindBy(name = "searchval")
    private WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"categoriesBox\"]/div[2]/a/div/div/img")
    private WebElement chefKnives;

    @FindBy(xpath = "//*[@id=\"panel-1\"]/a[2]/div[2]/div")
    private WebElement japaneseSteelKnives;

    @FindBy(id = "sort_options")
    private WebElement sortOption;

    @FindBy(xpath = "//*[@id=\"sort_options\"]/optgroup[1]/option[1]")
    private WebElement sortOptionByPriceLowToHigh;

    @FindBy(xpath = "//*[@id=\"sort_options\"]/optgroup[1]/option[2]")
    private WebElement sortOptionByPriceHighToLow;


    @FindBy(xpath = "//*[@id=\"sort_options\"]/optgroup[2]/option[3]")
    private WebElement sortOptionByRatingLowToHigh;

    @FindBy(xpath = "//*[@id=\"sort_options\"]/optgroup[2]/option[4]")
    private WebElement sortOptionByRatingHighToLow;

    @FindBy(xpath = "//*[@id=\"sort_options\"]/optgroup[2]/option[5]")
    private WebElement sortOptionByNewest;

    @FindBy(xpath = "//*[@id=\"sort_options\"]/optgroup[2]/option[6]")
    private WebElement sortOptionByOldest;

    @FindBy(xpath = "//*[@id=\"ProductBoxContainer\"]/div[1]/a/div/img[2]")
    private List<WebElement> list;


    @FindBy(xpath = "//*[@id=\"ProductBoxContainer\"]/div[1]/a/div/img[2]")
    private WebElement chooseItem;

    @FindBy(xpath = "//*[@id=\"ProductBoxContainer\"]/div[4]/form/div/div/input[2]")
    private WebElement addToCart;

    @FindBy(xpath = "//*[@id=\"watnotif-wrapper\"]/div/p/div[2]/div[2]/a[2]")
    private WebElement OnCart;

    @FindBy(xpath = "//*[@id=\"subject\"]/div[2]/div/a[2]")
    private WebElement checkout;






    public void clickOnSearchBox() {
        searchBox.click();
    }

    public void clickOnSubmit() {
        searchBox.submit();
    }

    public void sendKeysToSearchBox(String itemName) {

        searchBox.sendKeys(itemName);
    }


    public void clickOnChefKnives() {
        chefKnives.click();

    }

    public void clickOnJapaneseSteelKnives() {
        japaneseSteelKnives.click();
    }

    public void clickOnSortOption() {
        sortOption.click();
    }

    public void clickOnSortOptionByPriceLowToHigh() {
        sortOption.click();
    }

    public void clickOnSortOptionByPriceHighToLow() {
        sortOption.click();

    }

    public void clickOnSortOptionRatingLowToHigh() {
        sortOption.click();
    }

    public void clickOnSortOptionRatingHighToLow() {
        sortOption.click();
    }

    public void clickOnSortOptionByNewest() {
        sortOption.click();
    }

    public void clickOnSortOptionByOldest() {
        sortOption.click();
    }

    public List<WebElement> getList(){

        return list;
    }

    public void clickOnChooseItem() {
        sortOption.click();
    }

    public void clickOnAddToCartChosenItem() {
        addToCart.click();
    }

    public void clickOnCart() {
        OnCart.click();
    }

    public void clickOnOpenCheckoutPage(){
        checkout.click();
    }


}


