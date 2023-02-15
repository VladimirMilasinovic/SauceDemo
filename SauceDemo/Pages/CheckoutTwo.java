package SauceDemo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static SauceDemo.Base.SauceDemoBaseTest.driver;

public class CheckoutTwo {
    public CheckoutTwo(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="postal-code" )
    public WebElement CheckOutPage;

    @FindBy(id="first-name")
    public WebElement FirstName;

    @FindBy(id="last-name")
    public WebElement LastName;

    @FindBy(id="postal-code")
    public WebElement PostalCode;

    @FindBy(id="continue")
    public WebElement Continue;

    public void inputFirstName(String firstName) {
        FirstName.clear();
        FirstName.sendKeys(firstName);
    }
    public void inputLastName(String lastName) {
        LastName.clear();
        LastName.sendKeys(lastName);
    }
    public void inputPostalCode(String postalCode){
        PostalCode.clear();
        PostalCode.sendKeys(postalCode);
    }
    public void clickOnContinue () {Continue.click();}

}
