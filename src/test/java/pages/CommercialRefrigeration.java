package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class CommercialRefrigeration {

    public CommercialRefrigeration() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[ contains( . , 'Refrigeration' )]")
    private WebElement CommercialRefrigerationLink;


    public void clickCommercialRefrigerationLink() {
        CommercialRefrigerationLink.click();
    }

}
