package Page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class SignUpPage {
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    BasePage basePage;

    public void signUp(String userName, String password){
        basePage  = new BasePage(driver);
        driver.get("https://www.demoblaze.com/");
        basePage.clickOnElement("id","signin2");
        basePage.insertInto("id", "sign-username",userName);
        basePage.insertInto("id","sign-password", password);
        basePage.clickOnElement("xpath", "//button[text()=\"Sign up\"]");
        basePage.explicitlyWait(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }
}
