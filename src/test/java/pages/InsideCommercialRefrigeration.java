package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Driver;

import java.util.List;

public class InsideCommercialRefrigeration {

    public InsideCommercialRefrigeration(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void setSearchBox(WebElement searchBox) {
        this.searchBox = searchBox;
    }

    public void setMessage(WebElement message) {
        this.message = message;
    }

    public void setList(List<WebElement> list) {
        this.list = list;
    }

    public void setFooterPrivacy(WebElement footerPrivacy) {
        this.footerPrivacy = footerPrivacy;
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getFooterPrivacy() {
        return footerPrivacy;
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

    @FindBy (id = "privacy-footer-links")
    private WebElement footerPrivacy;

    public  WebElement getMessage() {
        return message;
    }


    public void lookForItems(String searchWord){

        searchBox.sendKeys(searchWord, Keys.ENTER);
    }
}
