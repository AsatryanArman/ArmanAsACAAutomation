package Page;

import org.openqa.selenium.WebDriver;

public class PersonInfoPage {
    WebDriver driver;
    BasePage basePage;
    public PersonInfoPage(WebDriver driver) {
        this.driver = driver;
    }
    public void personalInfo() {
        basePage = new BasePage(driver);
        basePage.clickOnElement("css","[id='id_gender1']");
        basePage.insertInto("css", "[id='customer_firstname']", "Adolf");
        basePage.insertInto("css", "[id='customer_lastname']", "Pellegrini");
        basePage.insertInto("css", "[data-validate='isPasswd']", "SiegHeil");
        basePage.selectElement("css","[id='days']", "25");
        basePage.selectElement("css","[id='months']", "10");
        basePage.selectElement("css","[id='years']", "1994");
        basePage.clickOnElement("css","[name='newsletter']");
        basePage.insertInto("css", "[id='company']", "Pablo Escobar inc.");
        basePage.insertInto("css", "[id='address1']", "Rionegro");
        basePage.insertInto("css", "[id='city']", "Columbia");
        basePage.selectElement("css", "[id='id_state']", "43");
        basePage.insertInto("css", "[id='postcode']", "56975");
        basePage.selectElement("css", "[id='id_country']", "21");
        basePage.insertInto("css", "[id='other']", "I Love Me");
        basePage.insertInto("css", "[id='phone']", "546594");
        basePage.insertInto("css", "[id='phone_mobile']", "564646");
        basePage.insertInto("css", "[id='alias']", "Hollywood");
        basePage.clickOnElement("css", "[id='submitAccount']");
    }
}
