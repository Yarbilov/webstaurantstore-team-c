package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class FoodAndBev2Page {

    public FoodAndBev2Page() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[ contains( . , 'Food and Beverage' )]")
    private WebElement FoodAndBevButton;
    public void clickFoodAndBevButton() {FoodAndBevButton.click();}

    @FindBy(xpath = "//a[ contains( . , 'Dairy' )]")
    private WebElement DairyButton;
    public void clickDairyButton() {DairyButton.click();}

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/span/span/div/a")
    private WebElement MilkAndCreamButton;
    public void clickMilkAndCreamButton() {MilkAndCreamButton.click();}

    @FindBy(xpath = "//*[@id=\"panel-1\"]/a[1]/div[1]")
    private WebElement MilkButton;
    public void clickMilkButton() {MilkButton.click();}

    @FindBy(xpath = "//a[ contains( . , 'Organic Valley Half Gallon Organic Whole Milk - 6/Case' )]")
    private WebElement MilkSelected;
    public void clickMilkSelected() {MilkSelected.click();}

    @FindBy(xpath = "//*[@id=\"buyButton\"]")
    private WebElement BuyButton;
    public void clickBuyButton() {BuyButton.click();}

    @FindBy(xpath = "//*[@id=\"subject\"]/div[2]/div/a[1]/button")
    private WebElement ViewCartButton;
    public void clickViewCartButton() {ViewCartButton.click();}


}
