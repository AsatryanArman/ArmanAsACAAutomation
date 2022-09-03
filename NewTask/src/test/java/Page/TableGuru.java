package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableGuru {
    WebDriver driver;
    BasePage basePage;
    String getLog, getPass;

    public TableGuru(WebDriver driver) {
        this.driver = driver;
    }

    public String getLog() {
        basePage = new BasePage(driver);
        WebElement login = basePage.getElement("xpath", "//table[@border='1']//tr[4]//td[2]");
        getLog = login.getText();
        return getLog;
    }

    public String getGetPass() {
        WebElement pass = basePage.getElement("xpath", "//table[@border='1']//tr[5]//td[2]");
        getPass = pass.getText();
        return getPass;
    }
}