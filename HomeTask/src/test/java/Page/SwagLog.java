package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class SwagLog {
    WebDriver driver;
    BasePage basePage;

    public SwagLog(WebDriver driver) {
        this.driver = driver;
    }

    public void getLog() {
        basePage = new BasePage(driver);

        HashMap<Integer, String> login = new HashMap<>();
        List<WebElement> log = driver.findElements(By.cssSelector("[id='login_credentials']"));
        String usernames = log.get(0).getText();
        String[] users = usernames.split("\n");
        for (var i = 1; i < users.length; i++) {
            login.put(i, users[i]);
        }
        basePage.insertInto("css", "[id='user-name']", login.get(1));

        HashMap<Integer, String> password = new HashMap<>();
        List<WebElement> pass = basePage.getElements("css", "[class='login_password']");
        String passwords = pass.get(0).getText();
        String[] pas = passwords.split("\n");
        for (var i = 1; i < pas.length; i++) {
            password.put(i, pas[i]);
        }
        basePage.insertInto("css", "[id='password']", password.get(1));
        basePage.clickOnElement("css", "[id='login-button']");
    }
}
