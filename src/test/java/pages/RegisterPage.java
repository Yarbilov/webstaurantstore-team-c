package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


import java.util.List;

import static utils.Driver.getDriver;

public class RegisterPage {




    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//strong[@class = 'font-semibold text-base-1/2 leading-none'])[2]")
    private WebElement registerButton;


    public void clickRegisterButton(){
        registerButton.click();
    }
}





