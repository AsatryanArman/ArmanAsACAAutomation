package Page;

import org.openqa.selenium.WebDriver;

public class Guru99 {
    WebDriver driver;
    BasePage basePage;

    public Guru99(WebDriver driver) {
        this.driver = driver;
    }

    public void emailId(String email) {
        basePage = new BasePage(driver);
        basePage.insertInto("css", "[name='emailid']", email + "@gmail.com");
        basePage.clickOnElement("css", "[name ='btnLogin']");
    }
}