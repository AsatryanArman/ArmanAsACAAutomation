package Test;

import Base.SeleniumBase;
import Page.*;
import Utils.RndEmail;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest extends SeleniumBase {
    BasePage basePage;
    Guru99 guru99;
    TableGuru tableGuru;
    BankProject bankProject;
    NewCustomer newCustomer;
    ClickEndSubmit clickEndSubmit;
    RndEmail rndEmail = new RndEmail();
    String email;

    @BeforeTest
    public void driverInt() {
        initDriver();
        basePage = new BasePage(driver);
    }

    @Test
    public void logTest() {
        guru99 = new Guru99(driver);
        email = rndEmail.randomStr(6);
        guru99.emailId(email);
        basePage.checkPageTitle("Guru99 Bank Home Page");
    }

    @Test(priority = 1)
    public void getLogPass() {
        tableGuru = new TableGuru(driver);
        tableGuru.getLog();
        tableGuru.getGetPass();
        basePage.checkElementText("xpath","//h4[center]","Please take SCREESNSHOT of this page for future reference.");
    }

    @Test(priority = 2)
    public void bankTest() {
        bankProject = new BankProject(driver);
        tableGuru = new TableGuru(driver);
        bankProject.newAcc(tableGuru.getLog(), tableGuru.getGetPass());
        basePage.checkElementText("xpath","//h2[@class]","Gtpl Bank");
    }

    @Test(priority = 3)
    public void persId() {
        newCustomer = new NewCustomer(driver);
        newCustomer.customerInfo(email);
        basePage.checkPageTitle("Gtpl Bank New Customer Entry Page");
    }

    @Test(priority = 4)
    public void checkText() {
        clickEndSubmit = new ClickEndSubmit(driver);
        clickEndSubmit.checkError();
        basePage.checkElementText("xpath", "//body", "Connection failed: " +
                "Access denied for user 'root'@'localhost' (using password: NO)");
    }
}