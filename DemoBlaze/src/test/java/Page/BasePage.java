package Page;

import Base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Locale;

public class BasePage extends Base.SeleniumBase {
    public BasePage(WebDriver driver) {
        this.driver = driver;}
    public By getByType (String locatorType, String locator) {
        if (locatorType.toLowerCase(Locale.ROOT).equals("css")) {
            return By.cssSelector(locator);
        }else if (locatorType.toLowerCase(Locale.ROOT).equals("xpath")) {
            return By.xpath(locator);
        }else if (locatorType.toLowerCase(Locale.ROOT).equals("id")){
            return By.id(locator);
        }else  if (locatorType.toLowerCase(Locale.ROOT).equals("name")) {
            return By.name(locator);
        }else {
            return By.tagName("");
        }
    }
    public WebElement getElement(String locatorType, String locator){
        By byType = getByType(locatorType, locator);
        WebElement elem = driver.findElement(byType);
        return elem;
    }
    public List<WebElement> getElements(String locatorType, String locator){
        By byType = getByType(locatorType, locator);
        List<WebElement> elems = driver.findElements(byType);
        return elems;
    }

    public void insertInto(String locatorType, String locator, String text){
        By byType = getByType(locatorType, locator);
        driver.findElement(byType).sendKeys(text);
    }

}