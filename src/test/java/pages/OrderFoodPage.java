package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;

public class OrderFoodPage {


    public OrderFoodPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@data-type = 'Food &<br /> Beverage']")
    private WebElement FoodAndBeverage;


    @FindBy(xpath = "(//p[@class = 'block font-semibold text-sm leading-none mb-0 mt-2-1/2 max-h-10 min-h-10 text-center'])[3]")
    private WebElement desert;

    @FindBy(xpath = "//h2[@data-testid = 'displayTitle'][.='Macarons']")
    private WebElement macaron;

    @FindBy(xpath = "//a[@data-testid='itemDescription'][.='White Toque French Raspberry Macarons - 105/Case']")
    private WebElement pinkMacarons;


    @FindBy(id = "buyButton")
    private WebElement button;

    @FindBy(xpath = "//button[@class = 'btn btn-primary']")
    private WebElement viewCart;

    @FindBy(xpath = "(//button[@type = 'submit'])[4]")
    private WebElement checkOutButton;

    public void FoodBeverageLink (){
        FoodAndBeverage.click();

    }

    public void desertLink(){
        desert.click();
    }

    public void macaronsLink(){
        macaron.click();
       pinkMacarons.click();
       button.click();
    }

    public void setViewCart(){
        viewCart.click();
       checkOutButton.click();
    }







}
