package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Driver;

import java.util.List;

public class InsideIndustrialSuppliesPage {

    public InsideIndustrialSuppliesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "searchval")
    private WebElement searchBox;


    @FindBy(xpath = "//div[@class='search__wrap']")
    private WebElement message;

    @FindBy(xpath = "//div[@class='ag-item p-2 xs:p-4']")
    private List<WebElement> list;

    public List<WebElement> getList(){
        return list;
    }

    public  WebElement getMessage() {
        return message;
    }


    public void lookForItems(String searchWord){

        searchBox.sendKeys(searchWord, Keys.ENTER);
    }



}
