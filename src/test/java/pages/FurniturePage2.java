package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Driver;

public class FurniturePage2 {

    public FurniturePage2() {PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//a[ contains( . , 'Furniture' )]")
    private WebElement furnitureButton;

    public void clickfurnitureButton() {furnitureButton.click();}

    }


