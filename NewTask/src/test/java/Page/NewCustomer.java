package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomer {
    WebDriver driver;
    BasePage basePage;

    public NewCustomer(WebDriver driver) {
        this.driver = driver;
    }
    public void customerInfo(String email){
        basePage = new BasePage(driver);
        driver.findElement(By.linkText("New Customer")).click();
        basePage.insertInto("css","[onkeyup='validatecustomername();']","VitoCorleone");
        basePage.insertInto("css","[id='dob']","10121994");
        basePage.insertInto("css","[name='addr']", "Shahumyan dqi vra");
        basePage.insertInto("css","[name='city']", "Yerevan");
        basePage.insertInto("css", "[name='state']", "BankiKrug");
        basePage.insertInto("css","[name='pinno']","364656");
        basePage.insertInto("css","[name='telephoneno']","0897646");
        basePage.insertInto("css", "[name='emailid']",email + "@gmail.com");
    }
}
