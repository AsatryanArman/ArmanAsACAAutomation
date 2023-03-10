package Page;

import org.openqa.selenium.WebDriver;

public class SelectPrice {
    WebDriver driver;
    BasePage basePage;

    public SelectPrice(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDropDown() {
        basePage = new BasePage(driver);
        basePage.selectElement("css", "[data-test='product_sort_container']", "lohi");
    }

    public void addToCard() {
        basePage.clickOnElement("css", "[id='add-to-cart-sauce-labs-fleece-jacket']");
        basePage.clickOnElement("css", "[id='shopping_cart_container']");

    }
}