package SauceDemo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static SauceDemo.Base.SauceDemoBaseTest.driver;

public class SauceLabsBoltTShirtPage {
    public SauceLabsBoltTShirtPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText="Sauce Labs Bolt T-Shirt" )
    public WebElement BoltTShirt;

    public void clickOnBoltShirt(){BoltTShirt.click();}

    @FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement AddTShirt;

    @FindBy(id="remove-sauce-labs-bolt-t-shirt")
    public WebElement RemoveTShirt;

    public void clickOnAddTShirt() {AddTShirt.click();}
    public void clickOnRemoveTShirt() {RemoveTShirt.click();}
}
