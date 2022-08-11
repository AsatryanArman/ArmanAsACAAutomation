package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;
    BasePage basePage;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void goToHomePage() {
        WebElement home = driver.findElement(By.cssSelector("[class='nav-link']"));
        home.click();
//        basePage = new BasePage(driver);
//        basePage.goToMenuItem("Home", "css",
//                "[class='nav-link']");
    }

}
