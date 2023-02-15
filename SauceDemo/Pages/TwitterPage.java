package SauceDemo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static SauceDemo.Base.SauceDemoBaseTest.driver;

public class TwitterPage {
    public TwitterPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(className="social_twitter" )
    public WebElement Twitter;

    public void clickOnTwitter(){Twitter.click();}
}
