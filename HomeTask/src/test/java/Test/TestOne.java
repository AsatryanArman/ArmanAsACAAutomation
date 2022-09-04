package Test;

import Base.SeleniumBase;
import Page.BasePage;
import Page.FillAppropriate;
import Page.SelectPrice;
import Page.SwagLog;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOne extends SeleniumBase {
    BasePage basePage;
    SwagLog swagLog;
    SelectPrice selectPrice;
    FillAppropriate fillAppropriate;

    @BeforeTest
    public void intDriver() {
        initDriver();
        basePage = new BasePage(driver);
        basePage.checkPageTitle("Swag Labs");
    }

    @Test
    public void logGet() {
        swagLog = new SwagLog(driver);
        swagLog.getLog();
        basePage.getElement("css", "[id='react-burger-menu-btn']").isDisplayed();
    }

    @Test(priority = 1)
    public void dropDown() {
        selectPrice = new SelectPrice(driver);
        selectPrice.selectDropDown();
        selectPrice.addToCard();
        basePage.checkElemetText("css", "[class='inventory_item_name']", "Sauce Labs Fleece Jacket");
        basePage.checkElemetText("css", "[class='inventory_item_price']", "$49.99");
    }

    @Test(priority = 2)
    public void checkMessage() {
        fillAppropriate = new FillAppropriate(driver);
        fillAppropriate.addJacket();
        basePage.checkElemetText("css", "[class='complete-header']", "THANK YOU FOR YOUR ORDER");
    }
}