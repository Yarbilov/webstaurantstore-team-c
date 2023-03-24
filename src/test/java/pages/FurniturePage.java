
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class FurniturePage {

    public FurniturePage(){
        PageFactory.initElements(Driver.getDriver(),this);//initialize everything that has @FindBy annotation
    }

    @FindBy(xpath="//a[ contains( . , 'Furniture' )]")
    private WebElement furnitureElement;

    public void clickFurnitureElement(){
        furnitureElement.click();
    }
    @FindBy(xpath="//a[ contains( . , 'Chairs' )]")
    private WebElement chairsElement;

    public void clickChairsElement(){
        chairsElement.click();
    }

    @FindBy(xpath="//a[ contains( . , 'Bar Stools' )]")
    private WebElement barStoolsElement;

    public void clickBarStoolsElement(){
        barStoolsElement.click();
    }

    @FindBy(xpath="//a[ contains( . , 'Restaurant Tables' )]")
    private WebElement restaurantTablesElement;

    public void clickRestaurantTablesElement(){
        restaurantTablesElement.click();
    }

    @FindBy(xpath="//a[ contains( . , 'Restaurant Booths' )]")
    private WebElement restaurantBoothsElement;

    public void clickRestaurantBoothsElement(){
        restaurantBoothsElement.click();
    }

    @FindBy(xpath="//a[ contains( . , 'Restaurant Benches' )]")
    private WebElement restaurantBenchesElement;

    public void clickRestaurantBenchesElement(){
        restaurantBenchesElement.click();
    }

    @FindBy(xpath="//a[ contains( . , 'Restaurant Chairs' )]")
    private WebElement restaurantChairsElement;

    public void clickRestaurantChairsElement(){
        restaurantChairsElement.click();
    }
    @FindBy(xpath="//a[ contains( . , 'Restaurant Stools' )]")
    private WebElement restaurantStoolsElement;

    public void clickRestaurantStoolsElement(){
        restaurantStoolsElement.click();
    }

    @FindBy(xpath="//a[ contains( . , 'Restaurant Table Tops' )]")
    private WebElement restaurantTableTopsElement;

    public void clickRestaurantTableTopsElement(){
        restaurantTableTopsElement.click();
    }

    @FindBy(xpath="//a[ contains( . , 'Restaurant Table Bases' )]")
    private WebElement restaurantTableBasesElement;

    public void clickRestaurantTableBasesElement(){
        restaurantTableBasesElement.click();
    }

    public void test() {
    }
}



