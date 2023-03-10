import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutoWaitSelect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://auto.am/");

        WebElement go  = driver.findElement(By.cssSelector("[class='smart-prompt-message-container ltr']"));
        if(go.isDisplayed()) {

            WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='ppialog-popover-cancel-button']")));
             firstResult.click();
        }
        SelectElement(driver,"[id='filter-make']", "31");
        SelectElement(driver,"[id='v-model']", "475");
        SelectElement(driver,"[name='year[gt]']", "2018");
        SelectElement(driver,"[name='year[lt]']", "2022");
        SelectElement(driver,"[name='usdprice[gt]']","2000" );
        SelectElement(driver,"[name='usdprice[lt]']", "7000");
        WebElement search = new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='search-btn']")));
        Thread.sleep(1500);
        System.out.println(search.getText());
        search.click();
//        WebElement filter = new WebDriverWait(driver, Duration.ofSeconds(30))
//                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='filter-make']")));
//        Select  bmw = new Select(filter);
//        bmw.selectByValue("31");
//
//        WebElement model = new WebDriverWait(driver, Duration.ofSeconds(30))
//                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='v-model']")));
//        Select bmw1series = new Select(model);
//        bmw1series.selectByVisibleText("320");
//
//        WebElement year = new WebDriverWait(driver,Duration.ofSeconds(20))
//                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='year[gt]']")));
//        Select year1 = new Select(year);
//        year1.selectByVisibleText("2018");
//
//        WebElement year2 = new WebDriverWait(driver,Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='year[lt]']")));
//        Select year3 = new Select(year2);
//        year3.selectByIndex(1);
//
//        WebElement price = new WebDriverWait(driver,Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='usdprice[gt]']")));
//        Select price1 = new Select(price);
//        price1.selectByValue("2000");
//
//        WebElement price2 = new WebDriverWait(driver,Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='usdprice[lt]']")));
//        Select price3 = new Select(price2);
//        price3.selectByValue("7000");
//
//     WebElement search = new WebDriverWait(driver, Duration.ofSeconds(30))
//             .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='search-btn']")));
//        Thread.sleep(3000);
//        System.out.println("------" + search.getText());
//        Thread.sleep(3000);
//        search.click();

      driver.close();
    }
    public static void SelectElement(WebDriver driver, String selector, String value){
        WebElement element = new WebDriverWait(driver,Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector(selector)));
        Select price = new Select(element);
        price.selectByValue(value);
    }
}