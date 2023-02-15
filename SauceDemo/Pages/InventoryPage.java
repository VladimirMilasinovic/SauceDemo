package SauceDemo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static SauceDemo.Base.SauceDemoBaseTest.driver;

public class InventoryPage {
    public InventoryPage(){
        PageFactory.initElements(driver,this);
    }
   @FindBy (className="title" )
    public WebElement titleProducts;

    @FindBy(id="react-burger-menu-btn")
    public WebElement UpperLeftMenuButton;

    @FindBy(id="inventory_sidebar_link")
    public WebElement AllItems;

    @FindBy(id="about_sidebar_link")
    public WebElement About;

    @FindBy(id="logout_sidebar_link")
    public WebElement Logout;

    @FindBy(id="reset_sidebar_link")
    public WebElement ResetApp;

    @FindBy(id="react-burger-cross-btn")
    public WebElement EscapeButton;

    @FindBy(id="shopping_cart_container")
    public WebElement ShoppingCartIcon;

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    public WebElement AddBackPack;

    @FindBy(id="remove-sauce-labs-backpack")
    public WebElement RemoveBackPack;

    @FindBy(id="add-to-cart-sauce-labs-bike-light")
    public WebElement AddBikeLight;

    @FindBy(id="remove-sauce-labs-bike-light")
    public WebElement RemoveBikeLight;

    @FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement AddTShirt;

    @FindBy(id="remove-sauce-labs-bolt-t-shirt")
    public WebElement RemoveTShirt;

    @FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
    public WebElement AddFleeceJacket;

    @FindBy(id="remove-sauce-labs-fleece-jacket")
    public WebElement RemoveFleeceJacket;

    @FindBy(id="add-to-cart-sauce-labs-onesie")
    public WebElement AddOnesie;

    @FindBy(id="remove-sauce-labs-onesie")
    public WebElement RemoveOnesie;

    @FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
    public WebElement AddAllTheThings;

    @FindBy(id="remove-test.allthethings()-t-shirt-(red)")
    public WebElement RemoveAllTheThings;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")
    public WebElement EnterBackPack;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[1]/a/div")
    public WebElement EnterTShirt;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[5]/div[2]/div[1]/a/div")
    public WebElement EnterOnesie;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]/a/div")
    public WebElement EnterBikeLight;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[4]/div[2]/div[1]/a/div")
    public WebElement EnterFleeceJacket;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[1]/a/div")
    public WebElement EnterAllTheThings;

    @FindBy(className = "social_twitter")
    public WebElement EnterTwitter;

    @FindBy(className = "social_facebook")
    public WebElement EnterFacebook;

    @FindBy(className = "social_linkedin")
    public WebElement EnterLinkedin;


    public void clickOnUpperLeftMenuButton () {UpperLeftMenuButton.click();}
    public void clickOnAllitems() {AllItems.click();}
    public void clickOnAbout() {About.click();}
    public void clickOnLogout() {Logout.click();}
    public void clickOnResetApp() {ResetApp.click();}
    public void clickOnEscapeButton() {EscapeButton.click();}
    public void clickOnShoppingIcon() {ShoppingCartIcon.click();}
    public void clickOnAddBackPack() {AddBackPack.click();}
    public void clickOnRemoveBackPack() {RemoveBackPack.click();}
    public void clickOnAddBikeLight() {AddBikeLight.click();}
    public void clickOnRemoveBikeLight() {RemoveBikeLight.click();}
    public void clickOnAddTShirt() {AddTShirt.click();}
    public void clickOnRemoveTShirt() {RemoveTShirt.click();}
    public void clickOnAddFleeceJacket() {AddFleeceJacket.click();}
    public void clickOnRemoveFleeceJacket() {RemoveFleeceJacket.click();}
    public void clickOnAddOnesie() {AddOnesie.click();}
    public void clickOnRemoveOnesie() {RemoveOnesie.click();}
    public void clickOnAddAllTheThings() {AddAllTheThings.click();}
    public void clickOnRemoveAllTheThings() {RemoveAllTheThings.click();}
 public void clickOnBackPack () {EnterBackPack.click();}
 public void clickOnTShirt () {EnterTShirt.click();}
 public void clickOnOnesie () {EnterOnesie.click();}
 public void clickOnBikeLight () {EnterBikeLight.click();}
 public void clickOnFleeceJacket () {EnterFleeceJacket.click();}
 public void clickOnAllTheThings () {EnterAllTheThings.click();}
 public void clickOnTwitter () {EnterTwitter.click();}
 public void clickOnFacebook () {EnterFacebook.click();}
 public void clickOnLinkedin () {EnterLinkedin.click();}

}
