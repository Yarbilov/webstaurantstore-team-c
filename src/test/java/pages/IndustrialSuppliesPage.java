package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class IndustrialSuppliesPage {


    public IndustrialSuppliesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[ contains( . , 'Indus' )]")
    private WebElement IndustrialLink;


    public void clickIndustrialLink(){
        IndustrialLink.click();
    }

}
