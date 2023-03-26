package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Furniture4 {

    public Furniture4(){
        PageFactory.initElements(Driver.getDriver(),this);//initialize everything that has @FindBy annotation
    }


    @FindBy(xpath="//*[@id=\"main\"]/div[1]/div/div/div[1]/div[3]/div[3]/div/div[1]/a/h2")
    private WebElement firstButton;


    @FindBy(xpath="carousel__card-title text-green-700")
    private WebElement secondButton;

    @FindBy(xpath="//*[@id=\"details\"]/a")
    private WebElement thirdButton;

    @FindBy(xpath="max-w-none w-full box-border block")
    private WebElement fourthButton;

    @FindBy(xpath="Size: 24\" x 24\" x 24\"")
    private WebElement fifthButton;

    @FindBy(xpath="Add to Cart")
    private WebElement firstImage;



    public void click1Button(){
        firstButton.click();
    }
    public void click2Button(){
        secondButton.click();
    }
    public void click3Button(){
        thirdButton.click();
    }
    public void click4Button(){
        fourthButton.click();
    }
    public void click5Button(){
        fifthButton.click();
    }
    public void click6Image(){
        firstImage.click();
    }




}
