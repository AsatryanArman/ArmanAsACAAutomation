package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Monitor {
    public Monitor(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    BasePage basePage;
    public void monitor(){
        basePage = new BasePage(driver);
        basePage.clickOnElement("css", "[onclick=\"byCat('monitor')\"]");
        basePage.clickOnElement("xpath","//a[text() ='ASUS Full HD']");
        WebElement price = driver.findElement(By.cssSelector("[class='price-container']"));
        System.out.println(price.getText());
        Assert.assertEquals(price.getText(), "$230 *includes tax");
    }
}
