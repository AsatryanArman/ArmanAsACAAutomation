package Page;

import Utils.LoginRandom;
import io.opentelemetry.api.internal.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
public class BlazeSignUp extends Base.SeleniumBase {

   LoginRandom l = new LoginRandom();
@Test
    public   void signUp()
    {
        driver.get("https://www.demoblaze.com/");
        WebElement signUp = new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='signin2']")));
        signUp.click();
        WebElement logIn = driver.findElement(By.cssSelector("[id='sign-username']"));
                logIn.sendKeys("a"+l);
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
