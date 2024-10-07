package Pages;

import Driver.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PerfumePage extends PageBase {

    public PerfumePage(WebDriver driver) {
        super(driver);
    }

    public void listProducts() {
        List<WebElement> products = driver.findElements(By.className("product-class")); // Adjust class name
        for (WebElement product : products) {
            System.out.println(product.getText());
        }
    }
}
