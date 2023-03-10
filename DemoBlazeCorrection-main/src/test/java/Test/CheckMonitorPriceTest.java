package Test;

import Base.SeleniumBase;
import Page.*;
import Utils.Helpers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckMonitorPriceTest extends SeleniumBase {
    SeleniumBase seleniumBase;
    BasePage basePage;
    SignUpPage signUpPage;
    HomePage homePage;
    MonitordPage monitordPage;
    Helpers helpers;
    LoginPage loginPage;

    private String username;
    private String password;

    @BeforeClass
    public void monitorTestPrerequisites() throws InterruptedException {
        basePage = new BasePage(driver);
        signUpPage = new SignUpPage(driver);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        helpers = new Helpers();
        String rndStr = helpers.randomStr(5);
        username = rndStr;
        password = rndStr;
        basePage.getUrl("https://www.demoblaze.com/");
        signUpPage.registration(username, password);
        loginPage.login(username,password);
        homePage.goToHomePage();
    }

    @Test
    public void testCheckMonitorPrice(){
        monitordPage = new MonitordPage(driver);
        monitordPage.monitor("$230 *includes tax");
    }
    @AfterClass
    public void driverQuit() {
        seleniumBase = new SeleniumBase();
        seleniumBase.quitDriver();
    }
}
