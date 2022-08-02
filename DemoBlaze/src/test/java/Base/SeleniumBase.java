package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class SeleniumBase {
    public WebDriver driver;
    @BeforeTest
     public void driverIn (){
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     }
     @AfterTest
    public void driverQuit() {
        //driver.quit();
     }

}
