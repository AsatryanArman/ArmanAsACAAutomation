
package Test;

import Base.SeleniumBase;
import Page.SignUpPage;
import Utils.Helpers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUpTest extends SeleniumBase {

    SignUpPage signUp;
    Helpers helpers = new Helpers();
    String login, password;

    @BeforeClass
    public void setupDriver() {
        InitDriver();
    }

//    @AfterClass
//    public void tearDown() {
//        quitDriver();
//    }

    @Test
    public void SignUpTest1() {
        signUp = new SignUpPage(driver);
        login = helpers.randomStr(6);
        password = helpers.randomStr(6);
        signUp.signUp(login, password);
    }

}