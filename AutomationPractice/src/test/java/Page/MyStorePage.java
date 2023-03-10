package Page;

import org.openqa.selenium.WebDriver;

public class MyStorePage {

    WebDriver driver;
    BasePage basePage;

    public MyStorePage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkTitle()  {
        basePage = new BasePage(driver);
        driver.get("http://automationpractice.com/index.php");
    }
}