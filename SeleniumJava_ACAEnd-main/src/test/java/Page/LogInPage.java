package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import javax.swing.text.TabableView;
import java.util.ArrayList;

public class LogInPage {
    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    BasePage basePage;
    public void login(String userName, String password) throws InterruptedException {
        basePage = new BasePage(driver);
        basePage.clickOnElement("id", "login2");
        basePage.insertInto("id", "loginusername", userName);
        basePage.insertInto("id", "loginpassword", password);
        basePage.clickOnElement("xpath", "//button[text()=\"Log in\"]");
        basePage.delay(3);
        basePage.checkElemetText("id", "nameofuser", "Welcome " + userName);
    }

}
