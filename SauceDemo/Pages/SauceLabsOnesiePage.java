package SauceDemo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static SauceDemo.Base.SauceDemoBaseTest.driver;

public class SauceLabsOnesiePage {
    public SauceLabsOnesiePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText="Sauce Labs Onesie" )
    public WebElement Onesie;

    public void clickOnOnesie(){Onesie.click();}

    @FindBy(id="add-to-cart-sauce-labs-onesie")
    public WebElement AddOnesie;

    @FindBy(id="remove-sauce-labs-onesie")
    public WebElement RemoveOnesie;

    public void clickOnAddOnesie() {AddOnesie.click();}
    public void clickOnRemoveOnesie() {RemoveOnesie.click();}
}
