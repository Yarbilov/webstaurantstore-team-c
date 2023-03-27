package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InsideRegisterPage;
import pages.RegisterPage;
import utils.ConfigReader;
import utils.Driver;

import java.io.ObjectInputFilter;

public class RegisterTest extends TestBase{



@Test
    public void registerTest(){
    RegisterPage registerPage = new RegisterPage();
    registerPage.clickRegisterButton();
    Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.webstaurantstore.com/myaccount.html?goto=register");
    }

   
    public void createAnAccount(){
        InsideRegisterPage page = new InsideRegisterPage();
        page.addEmail(ConfigReader.getProperty("email"));
        page.setBillingName();
        page.setBillingCompany();
        page.setCompanyType();
        page.setAddress();
        page.repeatAddress();
        page.setCountry();
        page.setZipCode();
        page.setPhone();
        page.clickSameAsBillingButton();
        page.setPassword(ConfigReader.getProperty("password"));
        page.createMyAccount();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.webstaurantstore.com/myaccount");
    }

    public void failedRegistration(){
    createAnAccount();
        InsideRegisterPage page = new InsideRegisterPage();
        page.addEmail(ConfigReader.getProperty("email"));
       page.setPassword(ConfigReader.getProperty(""));
    Assert.assertNotEquals(Driver.getDriver().getTitle(),"Your password must be at least 4 characters");





    }

}
