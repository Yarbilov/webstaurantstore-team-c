package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.ConfigReader;
import utils.Driver;

public class LoginCheckoutPage {


    public LoginCheckoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//a[@data-testid='login-nav-link']")
    private WebElement LoginButton;

    @FindBy(id = "email-login")
    private WebElement emailSection;

    @FindBy(id = "password-login")
    private WebElement passwordSection;

    @FindBy(xpath = "//button[@class = 'btn btn-primary loginBtn']")
    private WebElement loginButton;




    public void addEmail(){
        emailSection.sendKeys(ConfigReader.getProperty("email"));
    }

    public void addPassword(){

        passwordSection.sendKeys(ConfigReader.getProperty("password"));
        loginButton.click();

    }

    @FindBy(xpath = "//input[@placeholder='Name']")

    private WebElement creditCardName;
    public void clickCreditCardName(){
        String name = new Faker().address().firstName();
        creditCardName.sendKeys(name);
    }



   // public WebElement getCreditCardName() {return creditCardName;}

    @FindBy(xpath = "//input[@name='cardNumber']")
    private WebElement creditCardNumber;

    public void clickCreditCardNumber(){
        String cardNumber = new Faker().business().creditCardNumber();
        creditCardNumber.sendKeys(cardNumber);}

    @FindBy(xpath = "//input[@name='cardSecurityCode']")
    private WebElement CVV;

    public void clickCreditCVV(){
   CVV.sendKeys("582");}

        @FindBy(xpath = "//select[@name='expiryMonth']")
        private WebElement expMonth;
        public void selectExpMonth(){
            new Select(expMonth).selectByVisibleText("December");
        }

    @FindBy(xpath = "//select[@name='expiryYear']")
    private WebElement expYear;
    public void selectExpYear(){new Select(expYear).selectByIndex(8);}

    @FindBy(xpath = "//button[@class = 'btn btn-checkout btn-jumbo']")
    private WebElement checkOutButton;

    public void clickCheckOut(){
        checkOutButton.click();
    }

    @FindBy (id = "shipping_options")
private WebElement shippingOptions;




}
