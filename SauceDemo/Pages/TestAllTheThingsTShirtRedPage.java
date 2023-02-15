package SauceDemo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static SauceDemo.Base.SauceDemoBaseTest.driver;

public class TestAllTheThingsTShirtRedPage {
    public TestAllTheThingsTShirtRedPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText="Test.allTheThings() T-Shirt (Red)" )
    public WebElement TShirt;

    public void clickOnTShirt(){TShirt.click();}

    @FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
    public WebElement AddAllTheThings;

    @FindBy(id="remove-test.allthethings()-t-shirt-(red)")
    public WebElement RemoveAllTheThings;

    public void clickOnAddAllTheThings() {AddAllTheThings.click();}
    public void clickOnRemoveAllTheThings() {RemoveAllTheThings.click();}
}
