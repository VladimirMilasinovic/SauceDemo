package SauceDemo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static SauceDemo.Base.SauceDemoBaseTest.driver;

public class SauceLabsBikeLightPage {
    public SauceLabsBikeLightPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText="Sauce Labs Bike Light" )
    public WebElement BikeLight;

    public void clickOnBikeLight(){BikeLight.click();}

    @FindBy(id="add-to-cart-sauce-labs-bike-light")
    public WebElement AddBikeLight;

    @FindBy(id="remove-sauce-labs-bike-light")
    public WebElement RemoveBikeLight;

    public void clickOnAddBikeLight() {AddBikeLight.click();}
    public void clickOnRemoveBikeLight() {RemoveBikeLight.click();}


}
