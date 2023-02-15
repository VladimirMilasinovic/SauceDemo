package SauceDemo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static SauceDemo.Base.SauceDemoBaseTest.driver;

public class CheckoutThree {
    public CheckoutThree(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(className="cart_quantity_label" )
    public WebElement overView;

    @FindBy(id="finish")
    public WebElement Finish;

    @FindBy(id="cancel")
    public WebElement Cancel;

    public void clickOnFinish () {Finish.click();}

    public void clickOnCancel () {Cancel.click();}
}
