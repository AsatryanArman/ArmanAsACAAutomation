package Page;

import org.openqa.selenium.WebDriver;

public class AuthenPage {
    WebDriver driver;
    BasePage basePage;

    public AuthenPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickSignIn(String email) throws InterruptedException {
        basePage = new BasePage(driver);
        basePage.delay(5);
        basePage.clickOnElement("css", "[class='login']");
        basePage.delay(5);
        basePage.insertInto("css", "[id='email_create']", email + "@gmail.com");
        basePage.clickOnElement("css", "[id='SubmitCreate']");
    }
}