
package Test;

import Base.SeleniumBase;
import Page.LogInPage;
import Page.SignUpPage;
import Utils.Helpers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUpTest extends SeleniumBase {

    SignUpPage signUp;
    Helpers helpers = new Helpers();
    String login, password;
    LogInPage logInPage;

    @BeforeClass
    public void setupDriver() {
        InitDriver();

    }
    @Test
    public void SignUpTest1() {
        signUp = new SignUpPage(driver);
        login = helpers.randomStr(6);
        password = helpers.randomStr(6);
        signUp.signUp(login, password);
    }
    @Test(priority = 1)
    public void BlazeDemoTest() throws InterruptedException {
        logInPage  = new LogInPage(driver);
        logInPage.login(login, password);
    }
    @AfterClass
    public void tearDown() {
        quitDriver();
    }

}