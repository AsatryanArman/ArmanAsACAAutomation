package Page;

import org.openqa.selenium.WebDriver;

public class ClickEndSubmit {
    WebDriver driver;
    BasePage basePage;

    public ClickEndSubmit(WebDriver driver) {
        this.driver = driver;
    }

    public void checkError() {
        basePage = new BasePage(driver);
        basePage.clickOnElement("css", "[name='sub']");
    }
}
