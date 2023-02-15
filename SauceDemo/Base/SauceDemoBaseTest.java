package SauceDemo.Base;

import SauceDemo.Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class SauceDemoBaseTest {
    public static WebDriver driver;

    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public String LoginURL;
    public Homepage homepage;
    public InventoryPage inventoryPage;
    public SauceLabsBackpackPage sauceLabsBackpackPage;
    public SauceLabsBikeLightPage sauceLabsBikeLightPage;
    public SauceLabsBoltTShirtPage sauceLabsBoltTShirtPage;
    public SauceLabsFleeceJacketPage sauceLabsFleeceJacketPage;
    public SauceLabsOnesiePage sauceLabsOnesiePage;

    public TestAllTheThingsTShirtRedPage testAllTheThingsTShirtRedPage;
    public CheckoutTwo checkoutTwo;
    public TwitterPage twitterPage;
    public CheckoutOne checkoutOne;
    public CheckoutThree checkoutThree;
    public CheckoutFinish checkoutFinish;


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        excelReader = new ExcelReader("src/test/java/SauceDemo/TestData.xlsx");
        LoginURL = excelReader.getStringData("URL", 1, 0);
    }

    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    }
}
