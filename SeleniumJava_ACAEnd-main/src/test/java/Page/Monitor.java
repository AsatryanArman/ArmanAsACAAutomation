package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;

import java.util.ArrayList;

public class Monitor {
    public Monitor(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    BasePage basePage;
    public void monitorPrice(String price){
        basePage = new BasePage(driver);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.demoblaze.com/");
        basePage.clickOnElement("css", "[onclick=\"byCat('monitor')\"]");
        basePage.clickOnElement("xpath","//a[text() ='ASUS Full HD']");
        basePage.verifyMenuItemText( price, "css", ".price-container");
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(0)).close();
//        basePage = new BasePage(driver);
//        basePage.clickOnElement("css", "[onclick=\"byCat('monitor')\"]");
//        basePage.clickOnElement("xpath","//a[text() ='ASUS Full HD']");
////        basePage.checkElemetText("css", "\"[class='price-container']\"", "$230 *includes tax");
//        WebElement price = driver.findElement(By.cssSelector("[class='price-container']"));
//        Assert.assertEquals(price.getText(), "$230 *includes tax");
    }
}
