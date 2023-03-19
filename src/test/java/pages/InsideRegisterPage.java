package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.ConfigReader;
import utils.Driver;

public class InsideRegisterPage {



    public InsideRegisterPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
@FindBy(id = "email")
    private WebElement email;

@FindBy(id = "billname")
    private WebElement billingName;

@FindBy(id = "billcompany")
private WebElement billingCompany;

@FindBy(id = "billcompany_type") // checkbox
private WebElement companyType;

@FindBy(id = "billaddr")
private WebElement address;



    @FindBy(id = "billaddr2")
    private WebElement address2; //should be the same

    @FindBy(name = "BillingAddressCountry")
    private WebElement country;

    @FindBy(name ="BillingAddressZipCode")
    private WebElement zipCode;

    @FindBy(id = "billphone")
    private WebElement phone;

    @FindBy(id = "same")
    private WebElement buttonSameAsBilling; // leave as it is; default

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "complete_registration")
    private WebElement createMyAccountButton;




    public void addEmail(String email){
        this.email.sendKeys(ConfigReader.getProperty("email"));
    }

    public void setBillingName(){
        billingName.sendKeys("Duotech");
    }

    public void setBillingCompany(){ billingCompany.sendKeys("Duotech");}

    public void setCompanyType(){
        new Select(companyType).selectByVisibleText("Office" + Keys.ENTER);

    }

    public void setAddress(){
        address.sendKeys("123 Main Ct");
    }

    public void repeatAddress(){
       address2.sendKeys("123 Main Ct");
    }

    public void setCountry(){
        new Select(country).selectByVisibleText("United States");
    }

    public void setZipCode(){
        zipCode.sendKeys("20036");
    }

    public void setPhone(){
        phone.sendKeys("3012656587");
    }

    public void clickSameAsBillingButton(){
        buttonSameAsBilling.click();
    }
    public void setPassword(String password){
        this.password.sendKeys(ConfigReader.getProperty("password"));
    }

    public void createMyAccount(){
        createMyAccountButton.click();
    }
}
