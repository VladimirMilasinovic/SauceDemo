package SauceDemo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static SauceDemo.Base.SauceDemoBaseTest.driver;

public class SauceLabsFleeceJacketPage {
    public SauceLabsFleeceJacketPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText="Sauce Labs Fleece Jacket" )
    public WebElement FleeceJacket;

    public void clickOnFJacket(){FleeceJacket.click();}

    @FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
    public WebElement AddFleeceJacket;

    @FindBy(id="remove-sauce-labs-fleece-jacket")
    public WebElement RemoveFleeceJacket;

    public void clickOnAddFleeceJacket() {AddFleeceJacket.click();}
    public void clickOnRemoveFleeceJacket() {RemoveFleeceJacket.click();}
}
