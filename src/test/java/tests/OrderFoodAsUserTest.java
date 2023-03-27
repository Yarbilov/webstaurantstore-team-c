package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.LoginCheckoutPage;
import pages.OrderFoodPage;
import utils.Driver;

public class OrderFoodAsUserTest extends TestBase{

// @Test
//    public void Login(){
//

    @Test(priority = 0)

    public void FoodAndBeverageSection(){

        OrderFoodPage order = new OrderFoodPage();

        order.FoodBeverageLink();

        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Consumables Help You Build a Profitable Menu For Your Foodservice Business"));

          }


          @Test(priority = 1)
          public void chooseDesert(){
        FoodAndBeverageSection();
        new OrderFoodPage().desertLink();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.webstaurantstore.com/54651/dessert.html");
          }

          @Test(priority = 2)
          public void macaronsBuy(){
           FoodAndBeverageSection();
            chooseDesert();
            new OrderFoodPage().macaronsLink();
            Assert.assertTrue(Driver.getDriver().getPageSource().contains("Cart"));
          }

          @Test(priority = 3)
          public void cart() {
              FoodAndBeverageSection();
              chooseDesert();
              macaronsBuy();
              new OrderFoodPage().setViewCart();
          }

          @Test(priority = 4)

    public void addLoginAndPassword (){
        cart();
        LoginCheckoutPage login = new LoginCheckoutPage();


        login.addEmail();
        login.addPassword();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.webstaurantstore.com/shipping-billinginfo.cfm");
    }


@Test(priority = 5)
    public void checkout(){
        addLoginAndPassword();
            new CheckOutPage().switchToIframe();
        new LoginCheckoutPage().clickCreditCardName();
       new LoginCheckoutPage().clickCreditCardNumber();
        new LoginCheckoutPage().clickCreditCVV();
        new LoginCheckoutPage().selectExpMonth();
        new LoginCheckoutPage().selectExpYear();
        new CheckOutPage().switchToDefaultContent();
       new LoginCheckoutPage().clickCheckOut();
       new CheckOutPage().switchToIframe();
       Assert.assertEquals(new CheckOutPage().getErrorText().getText(),"Enter a valid credit card number");

    }






    }




























