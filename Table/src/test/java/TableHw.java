import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableHw {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        List<WebElement> tables =driver.findElements(By.xpath("//table[@id=\"customers\"]//tr[td]"));
        System.out.println("Table size: " + tables.size());
        List<WebElement>adobe = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/td[1]"));
        List<WebElement> yoshi = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/td[2]"));
        boolean b = true;
        String ad;
        String yo;
        for (WebElement list: adobe){
            for (WebElement l: yoshi) {
                yo=l.getText();
                ad= list.getText();
            if (ad.contains("Adobe") && yo.contains("Yoshi Tannamuri")) {
                System.out.println("Nice " + ad + " and " + yo);
                b = false;
                break;
         }
      }
  }         if (b) {
            System.out.println("BAD");
      }
        driver.close();
      }
  }
