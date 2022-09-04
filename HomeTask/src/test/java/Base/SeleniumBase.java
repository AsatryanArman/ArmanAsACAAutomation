package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumBase {

    public WebDriver driver;

    /**
     * This is the main method to init the WebDriver
     */
    public void initDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    /**
     * This is the main method to quit the WebDriver
     */
    public void quitDriver() {
        driver.quit();
    }
}