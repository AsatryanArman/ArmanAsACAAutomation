package Page;

import org.openqa.selenium.WebDriver;

public class BankProject {
    WebDriver driver;
    BasePage basePage;

    public BankProject(WebDriver driver) {
        this.driver = driver;
    }

    public void newAcc(String getLog, String getPass) {
        basePage = new BasePage(driver);
        basePage.clickOnElement("xpath", "//a[text()='Bank Project']");
        basePage.insertInto("css", "[name='uid']", getLog);
        basePage.insertInto("css", "[name='password']", getPass);
        basePage.clickOnElement("css", "[name='btnLogin']");
    }
}
