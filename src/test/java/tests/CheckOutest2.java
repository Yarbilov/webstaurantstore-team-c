package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import utils.Driver;
import utils.UtilsClassForCheckOut;

import java.io.IOException;
import java.time.Duration;

public class CheckOutest2 extends TestBase {


    @Test(dataProvider = "provideData")

    public void endToEnd(String email, String name,
                         String company, String address1,
                         String address2, String city,
                         String zip, String phone, String creditNum,
                         String ccv)  {

        new CheckOutPage().clickIndustrialWipes();
        new CheckOutPage().clickDropdown();
        new CheckOutPage().addRandomItemToCart();
        new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(new CheckOutPage().getAddedPopup()));

        Assert.assertTrue(new CheckOutPage().getAddedPopup().isDisplayed());

        new CheckOutPage().clickCloseButtonPopup();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", new CheckOutPage().getCart());
        new CheckOutPage().clickCheckoutButton();
        new CheckOutPage().getEmailBox().clear();
        new CheckOutPage().clickEmailBox(email);
        new CheckOutPage().getNameBox().clear();
        new CheckOutPage().clickNameBox(name);
        new CheckOutPage().getCompanyBox().clear();
        new CheckOutPage().clickCompanyBox(company);
        new CheckOutPage().getAddress1Box().clear();
        new CheckOutPage().clickAddress1(address1);
        new CheckOutPage().getAddress2Box().clear();
        new CheckOutPage().clickAddress2(address2);
        new CheckOutPage().getCityBox().clear();
        new CheckOutPage().clickCityBox(city);
        new CheckOutPage().getZipCodeBox().clear();
        new CheckOutPage().clickZipBox(zip);
        new CheckOutPage().getPhoneBox().clear();
        new CheckOutPage().clickPhoneBox(phone);
        new CheckOutPage().selectState();
        new CheckOutPage().clickPaymentButton();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.webstaurantstore.com/shipping-billinginfo.cfm");

        new CheckOutPage().clickUseSelectedAddress();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Review & Payment | WebstaurantStore");

        new CheckOutPage().switchToIframe();
        new CheckOutPage().clickCreditCardName(name);
        new CheckOutPage().clickCreditCardNumber(creditNum);
        new CheckOutPage().clickCreditCVV(ccv);
        new CheckOutPage().selectExpMonth();
        new CheckOutPage().selectExpYear();
        new CheckOutPage().switchToDefaultContent();
        new CheckOutPage().clickCHECKOUT();
        new CheckOutPage().switchToIframe();
        Assert.assertEquals(new CheckOutPage().getErrorText().getText(),"Enter a valid credit card number");

        }
        @DataProvider(parallel=true)
        public Object[][] provideData() throws IOException {

            return UtilsClassForCheckOut.readFromCSV("data.csv");
        }



    }



