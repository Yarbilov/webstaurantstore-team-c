package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class InsideIndustrialSuppliesPage {

    public InsideIndustrialSuppliesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "searchval")
    private WebElement searchBox;


    @FindBy(xpath = "//div[@class='search__wrap']")
    private WebElement message;

    public  WebElement getMessage() {
        return message;
    }


    public void lookForItems(String searchWord){

        searchBox.sendKeys(searchWord, Keys.ENTER);
    }

}
