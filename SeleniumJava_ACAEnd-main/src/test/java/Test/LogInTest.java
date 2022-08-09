package Test;

import Page.HomePage;
import Page.LogInPage;
import Page.Monitor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest  extends  SignUpTest{
    LogInPage loginPage;
    Monitor monitor;
    HomePage homePage;

    @Test(priority = 1)
    public void BlazeDemoTest() throws InterruptedException {
         loginPage  = new LogInPage(driver);
         loginPage.login(login, password);
    }
    @Test(priority = 2)
        public void HomeClicked() {
        homePage = new HomePage(driver);
        homePage.goToHomePage();

    }
    @Test(priority = 3)
    public void Clicked() {
        monitor = new Monitor(driver);
        monitor.monitor();
    }

}