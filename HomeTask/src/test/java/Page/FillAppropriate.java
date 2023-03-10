package Page;

import org.openqa.selenium.WebDriver;

public class FillAppropriate {
    WebDriver driver;
    BasePage basePage;

    public FillAppropriate(WebDriver driver) {
        this.driver = driver;
    }

    public void addJacket() {
        basePage = new BasePage(driver);
        basePage.clickOnElement("css", "[id='checkout']");
        basePage.insertInto("css", "[id='first-name']", "Rhaenyra ");
        basePage.insertInto("css", "[id='last-name']", "Targaryen");
        basePage.insertInto("css", "[id='postal-code']", "465889");
        basePage.clickOnElement("css", "[id='continue']");
        basePage.clickOnElement("css", "[id='finish']");
    }
}