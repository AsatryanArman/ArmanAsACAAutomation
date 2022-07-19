import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CarsDOM {
    public static void main(String[] args) throws InterruptedException {
cars();
    }

    public static void cars() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        WebElement bmwRadio = driver.findElement(By.cssSelector("[id='bmwradio']"));
        bmwRadio.click();
        Thread.sleep(1500);
        WebElement benzRadio = driver.findElement(By.id("benzradio"));
        benzRadio.click();
        WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
        bmwCheckBox.click();
        Thread.sleep(1500);
        WebElement hondaCheckBox = driver.findElement(By.id("hondacheck"));
        hondaCheckBox.click();
        Thread.sleep(1500);
        System.out.println("BMW is check? " + bmwCheckBox.isSelected() + "!");
        Thread.sleep(3000);
        System.out.println("BMW is check? " + bmwCheckBox.isSelected() + "!");
        Thread.sleep(3000);
        WebElement  Disable = driver.findElement(By.cssSelector("[value='Disable']"));
        Disable.click();

        WebElement  input = driver.findElement(By.id("enabled-example-input"));
        System.out.println("BMW is check? " + (input.getAttribute("disabled") == null ? " enabled" : " disabled") + "!");
        Disable.click();
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe")));
        WebElement support1 = driver.findElement(By.cssSelector("[data-id='41190']"));
        support1.click();
        driver.switchTo().defaultContent();
        bmwRadio.click();
        Thread.sleep(1500);
        driver.close();
    }
}
