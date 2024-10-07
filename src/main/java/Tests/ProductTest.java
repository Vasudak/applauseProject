package Tests;

import Driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.PerfumePage;

public class ProductTest {
    private WebDriver driver;
    private HomePage homePage;
    private PerfumePage perfumePage;

    @BeforeClass
    public void setup() {
        driver = DriverFactory.getDriver("chrome"); // or "firefox"
        driver.get("https://www.douglas.de/de");
        homePage = new HomePage(driver);
        perfumePage = new PerfumePage(driver);
    }

    @Test
    public void testPerfumeListing() {
        homePage.acceptCookies();
        homePage.navigateToPerfume();
        perfumePage.listProducts();
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
