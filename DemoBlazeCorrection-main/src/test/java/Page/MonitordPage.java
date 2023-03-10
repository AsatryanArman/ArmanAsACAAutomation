package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class MonitordPage {
    public MonitordPage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    BasePage basePage;
    public void monitor(String price){
        basePage = new BasePage(driver);
        basePage.clickOnElement("css", "[onclick=\"byCat('monitor')\"]");
        basePage.clickOnElement("xpath","//a[text() ='ASUS Full HD']");
        basePage.verifyMenuItemText( price, "css", ".price-container");
    }
}
