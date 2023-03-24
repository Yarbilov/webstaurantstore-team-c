package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

    public class PriceRangePage {

        public PriceRangePage(){


            PageFactory.initElements(Driver.getDriver(),this);//initialize everything that has @FindBy annotation
        }





        @FindBy(name="searchval")
        private WebElement searchBox;

        @FindBy(xpath="//*[@id=\"categoriesBox\"]/div[2]/a/div/div/img")
        private WebElement chefKnives;

        @FindBy(xpath="//*[@id=\"panel-1\"]/a[2]/div[2]/div")
        private   WebElement japaneseSteelKnives;

        @FindBy( id="sort_options")
        private WebElement sortOption;

        @FindBy(xpath="//*[@id=\"sort_options\"]/optgroup[1]/option[1]")
        private WebElement sortOptionByPriceLowToHigh;

        @FindBy(xpath="//*[@id=\"sort_options\"]/optgroup[1]/option[2]")
        private WebElement sortOptionByPriceHighToLow;

        public void clickOnSearchBox(){
            searchBox.click();
        }

        public void clickOnSubmit(){
            searchBox.submit();
        }

        public void sendKeysToSearchBox(String itemName){

            searchBox.sendKeys(itemName);
        }


        public void clickOnChefKnives(){
            chefKnives.click();

        }

        public void clickOnJapaneseSteelKnives(){
            japaneseSteelKnives.click();
        }
        public  void  clickOnSortOption(){
            sortOption.click();
        }
        public void clickOnSortOptionByPriceLowToHigh(){
            sortOption.click();
        }
        public void clickOnSortOptionByPriceHighToLow(){
            sortOption.click();
    }

}
