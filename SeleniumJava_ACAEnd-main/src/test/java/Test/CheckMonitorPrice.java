package Test;

import Base.SeleniumBase;
import Page.BasePage;
import Page.HomePage;
import Page.LogInPage;
import Page.Monitor;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CheckMonitorPrice extends SeleniumBase {
    Monitor monitor;
    HomePage homePage;
    SeleniumBase seleniumBase;
    @BeforeClass
    public void setupDriver() {
        InitDriver();
        driver.get("https://www.demoblaze.com/");
    }

    @Test
        public void HomeClicked()   {
        homePage = new HomePage(driver);
        homePage.goToHomePage();
        Assert.assertEquals(new BasePage(driver).getUrl(),"https://www.demoblaze.com/index.html");
    }
    @Test
    public void MonitorPrice() {
        monitor = new Monitor(driver);
        monitor.monitorPrice("$230 *includes tax");
    }
    @AfterClass
    public void tearDown() {
        quitDriver();
    }
}