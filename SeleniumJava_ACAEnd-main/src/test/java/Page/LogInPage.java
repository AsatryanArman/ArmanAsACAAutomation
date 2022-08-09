package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class LogInPage {
    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    BasePage basePage;
    public void login(String userName, String password) throws InterruptedException {
        basePage = new BasePage(driver);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.demoblaze.com/");
        basePage.clickOnElement("id", "login2");
        basePage.insertInto("id", "loginusername", userName);
        basePage.insertInto("id", "loginpassword", password);
        basePage.clickOnElement("xpath", "//button[text()=\"Log in\"]");
        basePage.delay(3);
        basePage.checkElemetText("id", "nameofuser", "Welcome " + userName);
        System.out.println("Welcome" + userName);
     //   basePage.getElement("css", "\"[onclick=\\\"byCat('monitor')\\\"]\"");
        //  basePage.delay(3);
     //   basePage.goToMenuItem("Home ", "css","[class='nav-link']");
    }

}
