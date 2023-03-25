package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Driver;

import java.util.List;
import java.util.Random;

public class CheckOutPage {


    public CheckOutPage(){
        PageFactory.initElements(Driver.getDriver(),this);//initialize everything that has @FindBy annotation
    }


    @FindBy(xpath = "//a[@data-name='Industrial Wipes']")
    private WebElement industrialWipes;

    @FindBy(xpath = "//input[@type='submit']")
    private List<WebElement>  industrialWipesItems;


    public WebElement getAddedPopup() {return addedPopup;}

    @FindBy(xpath = "//div[@data-role='notification']")
    private WebElement addedPopup;

    @FindBy(xpath = "//a[@data-testid='cart-nav-link']")
    private WebElement cart;
    public void clickCart(){cart.click();}
    public WebElement getCart() {
        return cart;
    }

    @FindBy(id = "BillingAddress.StateProvince")
    private WebElement dropDownState;
    public void selectState(){new Select(dropDownState).selectByVisibleText("Colorado");}

    @FindBy(xpath = "//button[@aria-label='close']")
    private WebElement closeButtonPopup;

    public void clickCloseButtonPopup(){closeButtonPopup.click();}

    @FindBy(xpath = "//button[@id='continue_to_payment']")
    private WebElement paymentButton;
    public void clickPaymentButton(){paymentButton.click();}

    @FindBy(xpath = "//button[@class='btn btn-checkout']")
    private WebElement useSelectedAddress;
    public void clickUseSelectedAddress(){useSelectedAddress.click();}

    @FindBy(xpath = "//button[@class='standardCheckoutButton btn btn-checkout btn-jumbo btn-large']")
    private WebElement checkoutButton;

    @FindBy(id = "email")
    private WebElement emailBox;
    public WebElement getEmailBox() {return emailBox;}

    public WebElement getNameBox() {return nameBox;}
    public WebElement getCompanyBox() {return companyBox;}
    public WebElement getAddress1Box() {return address1Box;}
    public WebElement getAddress2Box() {return address2Box;}
    public WebElement getCityBox() {return cityBox;}

    @FindBy(id = "BillingAddress.Name")
    private WebElement nameBox;
    public WebElement getZipCodeBox() {return zipCodeBox;}
    public WebElement getPhoneBox() {return phoneBox;}
    @FindBy(id = "BillingAddress.Company")

    private WebElement companyBox;

    @FindBy(id = "BillingAddress.AddressLine1")

    private WebElement address1Box;

    @FindBy(id = "BillingAddress.AddressLine2")

    private WebElement address2Box;

    @FindBy(id = "BillingAddress.City")

    private WebElement cityBox;

    @FindBy(id = "BillingAddress.PostalCode")

    private WebElement zipCodeBox;

    @FindBy(id = "BillingAddress.PhoneNumber")

    private WebElement phoneBox;


    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement creditCardName;
    public void clickCreditCardName(String n1){creditCardName.sendKeys(n1);}
    public WebElement getCreditCardName() {return creditCardName;}

    @FindBy(xpath = "//input[@name='cardNumber']")
    private WebElement creditCardNumber;
    public void clickCreditCardNumber(String n2){creditCardNumber.sendKeys(n2);}

    @FindBy(xpath = "//input[@name='cardSecurityCode']")
    private WebElement CVV;
    public void clickCreditCVV(String n3){CVV.sendKeys(n3);}

    @FindBy(xpath = "//select[@name='expiryMonth']")
    private WebElement expMonth;
    public void selectExpMonth(){new Select(expMonth).selectByVisibleText("December");}


    @FindBy(xpath = "//select[@name='expiryYear']")
    private WebElement expYear;
    public void selectExpYear(){new Select(expYear).selectByIndex(8);}

    @FindBy(xpath = "//button[@class='btn btn-checkout btn-jumbo']")
    private WebElement CHECKOUT;
    public void clickCHECKOUT(){CHECKOUT.click();}

    @FindBy(xpath = "//iframe[@title='Payment Form']")
    private WebElement iframe;


    @FindBy(xpath = "//div[contains(text(),'Enter a valid credit card number')]")
    private WebElement errorText;
    public WebElement getErrorText() {return errorText;}
    public void switchToIframe(){Driver.getDriver().switchTo().frame(iframe);}
    public void switchToDefaultContent(){Driver.getDriver().switchTo().defaultContent();}

    public void clickEmailBox(String key1){emailBox.sendKeys(key1);}
    public void clickNameBox(String key2){nameBox.sendKeys(key2);}
    public void clickCompanyBox(String key3){companyBox.sendKeys(key3);}
    public void clickAddress1(String key4){address1Box.sendKeys(key4);}
    public void clickAddress2(String key5){address2Box.sendKeys(key5);}
    public void clickCityBox(String key6){cityBox.sendKeys(key6);}
    public void clickZipBox(String key7){zipCodeBox.sendKeys(key7);}
    public void clickPhoneBox(String key8){phoneBox.sendKeys(key8);}
    public void clickCheckoutButton(){checkoutButton.click();}
    public void clickIndustrialWipes(){industrialWipes.click();}
    public void clickDropdown(){new Select(Driver.getDriver().findElement(By.name("order"))).selectByVisibleText("Rating: High to Low");}
    public void addRandomItemToCart(){industrialWipesItems.get(new Random().nextInt(industrialWipesItems.size())).click();}




}
