package SauceDemo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static SauceDemo.Base.SauceDemoBaseTest.driver;

public class Homepage {
    public Homepage (){
        PageFactory.initElements(driver,this );
    }
    @FindBy (id = "user-name")
    public WebElement Username;
    @FindBy (id = "password")
    public WebElement Password;
    @FindBy (id = "login-button")
    public WebElement LoginButton;

    public void inputUsername (String username){
        Username.clear();
        Username.sendKeys(username);
    }
    public void inputPassword (String password){
        Password.clear();
        Password.sendKeys(password);
    }
    public void clickOnLoginButton (){
        LoginButton.click();
    }

}
