package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class HomePage {

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;

    public void goToHomePage()  {
        WebElement home = driver.findElement(By.cssSelector("[class='nav-link']"));
        home.click();
//        basePage.goToMenuItem("Home ", "css",
//                "[class='navbar-nav ml-auto']");

    }
}
