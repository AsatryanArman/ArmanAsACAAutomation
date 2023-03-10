package Test;

import Base.SeleniumBase;
import Page.AuthenPage;
import Page.BasePage;
import Page.MyStorePage;
import Page.PersonInfoPage;
import Utils.RndEmail;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyStorePageTest extends SeleniumBase {
    MyStorePage myStorePage;
    RndEmail rndEmail = new RndEmail();
    BasePage basePage;
    String login;
    AuthenPage authenPage;
    PersonInfoPage personInfoPage;
    @BeforeClass
    public void setupDriver() {
        InitDriver();
    }
    @Test
    public void checkTitleTest(){
        basePage = new BasePage(driver);
        myStorePage = new MyStorePage(driver);
        myStorePage.checkTitle();
        basePage.checkPageTitle("My Store");

    }
    @Test
    public void clickTest() throws InterruptedException {
        basePage = new BasePage(driver);
        authenPage = new AuthenPage(driver);
        login = rndEmail.randomStr(8);
        authenPage.clickSignIn(login);
        basePage.checkPageTitle("Login - My Store");
    }
    @Test
    public void personalInfoTest() {
        personInfoPage = new PersonInfoPage(driver);
        basePage = new BasePage(driver);
        personInfoPage.personalInfo();
        basePage.checkPageTitle("My account - My Store");
    }
//    @AfterClass
//    public void quitDriver(){
//        driver.quit();
//    }
}
