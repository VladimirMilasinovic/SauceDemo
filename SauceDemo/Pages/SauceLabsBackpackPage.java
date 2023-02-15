package SauceDemo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static SauceDemo.Base.SauceDemoBaseTest.driver;

public class SauceLabsBackpackPage {
    public SauceLabsBackpackPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div" )
    public WebElement BackPack;

    public void clickOnSauceLabsBackpack () {BackPack.click();}

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    public WebElement AddBackPack;

    @FindBy(id="remove-sauce-labs-backpack")
    public WebElement RemoveBackPack;

    @FindBy(className = "inventory_details_img")
    public WebElement PictureBackpack;

    public void clickOnAddBackPack() {AddBackPack.click();}
    public void clickOnRemoveBackPack() {RemoveBackPack.click();}

    public void clickOnPicture(){PictureBackpack.click();}
}
