package Pages;

import Driver.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void acceptCookies() {
        try {
            driver.findElement(By.xpath("//button[contains(text(),'Akzeptieren')]")).click();
        } catch (Exception e) {
            System.out.println("Consent button not found or already accepted.");
        }
    }

    public void navigateToPerfume() {
        driver.findElement(By.linkText("Parfum")).click();
    }
}
