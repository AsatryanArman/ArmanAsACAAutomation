import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BlazeSignUp {
         WebDriver driver;
    @BeforeTest
    public   void signup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.demoblaze.com/");
        WebElement signUp = new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='signin2']")));
        signUp.click();
        WebElement logIn = driver.findElement(By.cssSelector("[id='sign-username']"));
                logIn.sendKeys("yuyrgdsderryttbwh");
        WebElement password = driver.findElement(By.cssSelector("[id='sign-password']"));
                password.sendKeys("araskhdhkd");
        WebElement signUp2 = new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=\"Sign up\"]")));
        signUp2.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.switchTo().defaultContent();
    }
}