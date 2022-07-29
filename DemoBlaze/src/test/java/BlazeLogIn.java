import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class BlazeLogIn extends BlazeSignUp{
    @Test(priority = 1)
    public  void login() {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.demoblaze.com/index.html");
        WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='login2']")));
        signIn.click();
        WebElement login1 = driver.findElement(By.cssSelector("[id='loginusername']"));
            login1.sendKeys("yuyrgdsderryttbwh");
        WebElement password1 = driver.findElement(By.cssSelector("[id='loginpassword']"));
            password1.sendKeys("araskhdhkd");
        WebElement login = new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=\"Log in\"]")));
        login.click();
        WebElement accName = driver.findElement(By.cssSelector("[id='nameofuser']"));
        accName.isDisplayed();
    }
}