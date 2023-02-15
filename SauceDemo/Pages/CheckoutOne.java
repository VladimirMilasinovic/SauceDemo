package SauceDemo.Pages;

import SauceDemo.Base.SauceDemoBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static SauceDemo.Base.SauceDemoBaseTest.driver;

public class CheckoutOne {
    public CheckoutOne(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="checkout" )
    public WebElement Checkout;

    @FindBy(id = "continue-shopping")
    public WebElement ContinueShopping;
    public void clickOnCheckout(){Checkout.click();}
    public void clickOnContinueShopping(){ContinueShopping.click();}

}
