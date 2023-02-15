package SauceDemo.Tests;

import SauceDemo.Base.SauceDemoBaseTest;
import SauceDemo.Pages.Homepage;
import SauceDemo.Pages.InventoryPage;
import SauceDemo.Pages.TestAllTheThingsTShirtRedPage;
import SauceDemo.Pages.TwitterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends SauceDemoBaseTest {
    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get(LoginURL);
        homepage = new Homepage();
        inventoryPage = new InventoryPage();
    }

    @Test
    public void userCanLogIn() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        Assert.assertTrue(inventoryPage.titleProducts.isDisplayed());
    }

    @Test
    public void userCannotLogInWrongUsername() {
        String invalidUsername = excelReader.getStringData("Login", 1, 2);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(invalidUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        Assert.assertTrue(homepage.LoginButton.isDisplayed());

    }

    @Test
    public void userCannotLogInWrongPassword() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String invalidPassword = excelReader.getStringData("Login", 1, 3);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(invalidPassword);
        homepage.clickOnLoginButton();
        Assert.assertTrue(homepage.LoginButton.isDisplayed());
    }

    @Test
    public void userCannotLogWrongUsernameAndPassword() {
        String invalidUsername = excelReader.getStringData("Login", 2, 2);
        String invalidPassword = excelReader.getStringData("Login", 4, 3);
        homepage.inputUsername(invalidUsername);
        homepage.inputPassword(invalidPassword);
        homepage.clickOnLoginButton();
        Assert.assertTrue(homepage.LoginButton.isDisplayed());
    }

    @Test
    public void userCanClickOnUpperLeftMeniButton() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnUpperLeftMenuButton();
        Assert.assertTrue(inventoryPage.UpperLeftMenuButton.isDisplayed());
    }

    @Test
    public void userCanClickOnAllItemsInMeni() throws InterruptedException {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnUpperLeftMenuButton();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inventory_sidebar_link")));
        inventoryPage.clickOnAllitems();
        Assert.assertTrue(inventoryPage.AllItems.isDisplayed());
    }

    @Test
    public void userCanClickOnAbout() throws InterruptedException {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnUpperLeftMenuButton();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("about_sidebar_link")));
        inventoryPage.clickOnAbout();
    }

    @Test
    public void userCanClickOnResetApp() throws InterruptedException {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnUpperLeftMenuButton();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("reset_sidebar_link")));
        inventoryPage.clickOnResetApp();
        Assert.assertTrue(inventoryPage.ResetApp.isDisplayed());
    }

    @Test
    public void userCanClickOnEscapeButton() throws InterruptedException {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnUpperLeftMenuButton();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-burger-cross-btn")));
        inventoryPage.clickOnEscapeButton();
        Assert.assertTrue(inventoryPage.EscapeButton.isDisplayed());
    }

    @Test
    public void userCanClickOnShoppingCartUpperRightIcon() throws InterruptedException {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnShoppingIcon();
        Assert.assertTrue(inventoryPage.ShoppingCartIcon.isDisplayed());
    }

    @Test
    //Iz nekog razloga pokazuje Null
    public void userCanClickOnContinueShopping() throws InterruptedException {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnShoppingIcon();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("continue-shopping")));
        checkoutOne.clickOnContinueShopping();
        Assert.assertTrue(inventoryPage.ShoppingCartIcon.isDisplayed());

    }

    @Test
    //Iz nekog razloga pokazuje Null
    public void userCanClickOnCheckout() throws InterruptedException {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnShoppingIcon();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout")));
        checkoutOne.clickOnCheckout();
        Assert.assertTrue(checkoutOne.Checkout.isDisplayed());
    }

    @Test
    //Iz nekog razloga pokazuje Null
    public void userCanFillFieldsAndContinue() throws InterruptedException {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnShoppingIcon();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout")));
        checkoutOne.clickOnCheckout();
        checkoutTwo.inputFirstName("Vladimir");
        checkoutTwo.inputLastName("Milasinovic");
        checkoutTwo.inputPostalCode("11070");
        checkoutTwo.clickOnContinue();
        Assert.assertTrue(checkoutTwo.Continue.isDisplayed());
    }

    @Test
    //Iz nekog razloga pokazuje Null
    public void userCanClickInStepThreeOnCancel() throws InterruptedException {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnShoppingIcon();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout")));
        checkoutOne.clickOnCheckout();
        checkoutTwo.inputFirstName("Vladimir");
        checkoutTwo.inputLastName("Milasinovic");
        checkoutTwo.inputPostalCode("11070");
        checkoutTwo.clickOnContinue();
        checkoutThree.clickOnCancel();
        Assert.assertTrue(checkoutThree.Cancel.isDisplayed());

    }

    @Test
    //Iz nekog razloga pokazuje Null
    public void userCanClickInStepThreeOnFinish() throws InterruptedException {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnShoppingIcon();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout")));
        checkoutOne.clickOnCheckout();
        checkoutTwo.inputFirstName("Vladimir");
        checkoutTwo.inputLastName("Milasinovic");
        checkoutTwo.inputPostalCode("11070");
        checkoutTwo.clickOnContinue();
        checkoutThree.clickOnFinish();
        Assert.assertTrue(checkoutThree.Finish.isDisplayed());

    }

    @Test
    //Iz nekog razloga pokazuje Null
    public void userCanClickInStepFourOnBackHome() throws InterruptedException {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnShoppingIcon();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout")));
        checkoutOne.clickOnCheckout();
        checkoutTwo.inputFirstName("Vladimir");
        checkoutTwo.inputLastName("Milasinovic");
        checkoutTwo.inputPostalCode("11070");
        checkoutTwo.clickOnContinue();
        checkoutThree.clickOnFinish();
        checkoutFinish.clickOnBackHome();
        Assert.assertTrue(checkoutFinish.FinishPage.isDisplayed());

    }

    @Test
    public void userCanAddBackPackToHomeCart() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnAddBackPack();
        Assert.assertTrue(inventoryPage.RemoveBackPack.isDisplayed());
    }

    @Test
    public void userCanRemoveBackPackFromHomeCart() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnAddBackPack();
        inventoryPage.clickOnRemoveBackPack();
        Assert.assertTrue(inventoryPage.AddBackPack.isDisplayed());
    }

    @Test
    public void userCanAddTShirtToHomeCart() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnAddTShirt();
        Assert.assertTrue(inventoryPage.RemoveTShirt.isDisplayed());
    }

    @Test
    public void userCanRemoveTShirtToHomeCart() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnAddTShirt();
        inventoryPage.clickOnRemoveTShirt();
        Assert.assertTrue(inventoryPage.AddTShirt.isDisplayed());
    }

    @Test
    public void userCanAddBikeLightToHomeCart() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnAddBikeLight();
        Assert.assertTrue(inventoryPage.RemoveBikeLight.isDisplayed());
    }

    @Test
    public void userCanRemoveBikeLightToHomeCart() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnAddBikeLight();
        inventoryPage.clickOnRemoveBikeLight();
        Assert.assertTrue(inventoryPage.AddBikeLight.isDisplayed());
    }

    @Test
    public void userCanAddFleeceJacketToHomeCart() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnAddFleeceJacket();
        Assert.assertTrue(inventoryPage.RemoveFleeceJacket.isDisplayed());
    }

    @Test
    public void userCanRemoveFleeceJacketToHomeCart() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnAddFleeceJacket();
        inventoryPage.clickOnRemoveFleeceJacket();
        Assert.assertTrue(inventoryPage.AddFleeceJacket.isDisplayed());
    }

    @Test
    public void userCanAddOnesieToHomeCart() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnAddOnesie();
        Assert.assertTrue(inventoryPage.RemoveOnesie.isDisplayed());
    }

    @Test
    public void userCanRemoveOnesieToHomeCart() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnAddOnesie();
        inventoryPage.clickOnRemoveOnesie();
        Assert.assertTrue(inventoryPage.AddOnesie.isDisplayed());
    }

    @Test
    public void userCanAddAllTheThingsToHomeCart() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnAddAllTheThings();
        Assert.assertTrue(inventoryPage.RemoveAllTheThings.isDisplayed());
    }

    @Test
    public void userCanRemoveAllTheThingsToHomeCart() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnAddAllTheThings();
        inventoryPage.clickOnRemoveAllTheThings();
        Assert.assertTrue(inventoryPage.AddAllTheThings.isDisplayed());
    }

    @Test
    public void userCanClickOnTwitter() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        scrollIntoView(inventoryPage.EnterTwitter);
        inventoryPage.clickOnTwitter();
        Assert.assertTrue(inventoryPage.EnterTwitter.isDisplayed());
    }

    @Test
    public void userCanClickOnFacebook() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        scrollIntoView(inventoryPage.EnterFacebook);
        inventoryPage.clickOnFacebook();
        Assert.assertTrue(inventoryPage.EnterFacebook.isDisplayed());
    }

    @Test
    public void userCanClickOnLinkedin() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        scrollIntoView(inventoryPage.EnterLinkedin);
        inventoryPage.clickOnLinkedin();
        Assert.assertTrue(inventoryPage.EnterLinkedin.isDisplayed());
    }

    @Test
    //Iz nekog razloga nece da asertuje da je sve ok. Dok koraci rade.
    public void userCanClickAndEnterinBackPack() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnBackPack();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_details_img")));
        Assert.assertTrue(sauceLabsBackpackPage.PictureBackpack.isDisplayed());

    }

    @Test
    //Iz nekog razloga nece da asertuje da je sve ok. Dok koraci rade.
    public void userCanClickAndEnterinTShirt() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnTShirt();
        Assert.assertTrue(sauceLabsBoltTShirtPage.BoltTShirt.isDisplayed());
    }

    @Test
    //Iz nekog razloga nece da asertuje da je sve ok. Dok koraci rade.
    public void userCanClickAndEnterinBikeLight() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnBikeLight();
        Assert.assertTrue(sauceLabsBikeLightPage.BikeLight.isDisplayed());
    }

    @Test
    //Iz nekog razloga nece da asertuje da je sve ok. Dok koraci rade.
    public void userCanClickAndEnterinFleeceJacket() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnFleeceJacket();
        Assert.assertTrue(sauceLabsFleeceJacketPage.FleeceJacket.isDisplayed());
    }

    @Test
    //Iz nekog razloga nece da asertuje da je sve ok. Dok koraci rade.
    public void userCanClickAndEnterinOnesie() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnOnesie();
        Assert.assertTrue(sauceLabsOnesiePage.Onesie.isDisplayed());
    }

    @Test
    //Iz nekog razloga nece da asertuje da je sve ok. Dok koraci rade.
    public void userCanClickAndEnterinAllTheThings() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnAllTheThings();

    }

    @Test
    //Daje informaciju da je null
    public void userCanAddToCartInsideBackpack() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnBackPack();
        sauceLabsBackpackPage.clickOnAddBackPack();
        Assert.assertTrue(inventoryPage.RemoveBackPack.isDisplayed());
    }

    @Test
    //Daje informaciju da je null
    public void userCanRemoveFromCartInsideBackpack() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnBackPack();
        sauceLabsBackpackPage.clickOnRemoveBackPack();
        Assert.assertTrue(inventoryPage.AddBackPack.isDisplayed());
    }

    @Test
    //Daje informaciju da je null
    public void userCanAddToCartInsideTShirt() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnBackPack();
        sauceLabsBoltTShirtPage.clickOnAddTShirt();
        Assert.assertTrue(inventoryPage.RemoveTShirt.isDisplayed());
    }

    @Test
    //Daje informaciju da je null
    public void userCanRemoveFromCartInsideTShirt() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnBackPack();
        sauceLabsBoltTShirtPage.clickOnRemoveTShirt();
        Assert.assertTrue(inventoryPage.AddTShirt.isDisplayed());
    }

    @Test
    //Daje informaciju da je null
    public void userCanAddToCartInsideBikeLight() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnBackPack();
        sauceLabsBikeLightPage.clickOnAddBikeLight();
        Assert.assertTrue(inventoryPage.RemoveBikeLight.isDisplayed());
    }

    @Test
    //Daje informaciju da je null
    public void userCanRemoveFromCartInsideBikeLight() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnBackPack();
        sauceLabsBikeLightPage.clickOnRemoveBikeLight();
        Assert.assertTrue(inventoryPage.AddBikeLight.isDisplayed());
    }

    @Test
    //Daje informaciju da je null
    public void userCanAddToCartInsideFleeceJacket() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnBackPack();
        sauceLabsFleeceJacketPage.clickOnAddFleeceJacket();
        Assert.assertTrue(inventoryPage.RemoveFleeceJacket.isDisplayed());
    }

    @Test
    //Daje informaciju da je null
    public void userCanRemoveFromCartInsideFleeceJacket() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnBackPack();
        sauceLabsFleeceJacketPage.clickOnRemoveFleeceJacket();
        Assert.assertTrue(inventoryPage.AddFleeceJacket.isDisplayed());
    }

    @Test
    //Daje informaciju da je null
    public void userCanAddToCartInsideOnesie() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnBackPack();
        sauceLabsOnesiePage.clickOnAddOnesie();
        Assert.assertTrue(inventoryPage.RemoveOnesie.isDisplayed());
    }

    @Test
    //Daje informaciju da je null
    public void userCanRemoveFromCartInsideOnesie() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnBackPack();
        sauceLabsOnesiePage.clickOnRemoveOnesie();
        Assert.assertTrue(inventoryPage.AddOnesie.isDisplayed());
    }

    @Test
    //Daje informaciju da je null
    public void userCanAddToCartInsideAllTheThings() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnBackPack();
        testAllTheThingsTShirtRedPage.clickOnAddAllTheThings();
        Assert.assertTrue(inventoryPage.RemoveAllTheThings.isDisplayed());
    }

    @Test
    //Daje informaciju da je null
    public void userCanRemoveFromCartInsideAllTheThings() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        inventoryPage.clickOnBackPack();
        testAllTheThingsTShirtRedPage.clickOnRemoveAllTheThings();
        Assert.assertTrue(inventoryPage.AddAllTheThings.isDisplayed());
    }

    @Test
    public void userCannotEnterUsernameIsLockedOut() {
        String validUsername = excelReader.getStringData("Login", 2, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        Assert.assertTrue(homepage.LoginButton.isDisplayed());
    }

    @Test
    public void userCanEnterWithProblemUser() {
        String validUsername = excelReader.getStringData("Login", 3, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        Assert.assertTrue(inventoryPage.titleProducts.isDisplayed());
    }
    @Test
    public void userCanEnterWithGlitchUser() {
        String validUsername = excelReader.getStringData("Login", 4, 0);
        String validPassword = excelReader.getStringData("Login", 1, 1);
        homepage.inputUsername(validUsername);
        homepage.inputPassword(validPassword);
        homepage.clickOnLoginButton();
        Assert.assertTrue(inventoryPage.titleProducts.isDisplayed());
    }
}


