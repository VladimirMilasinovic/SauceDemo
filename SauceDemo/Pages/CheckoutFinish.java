package SauceDemo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static SauceDemo.Base.SauceDemoBaseTest.driver;

public class CheckoutFinish {
    public CheckoutFinish(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(className="pony_express" )
    public WebElement FinishPage;

    @FindBy(id="back-to-products")
    public WebElement BackToProducts;

    public void clickOnBackHome (){BackToProducts.click();}
}
