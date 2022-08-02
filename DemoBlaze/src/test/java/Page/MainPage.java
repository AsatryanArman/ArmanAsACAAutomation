package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver driver;

    public  MainPage (WebDriver driver){
        this.driver = driver;

    }
    public String getText(By elementBy){
        return driver.findElement(elementBy).getText();
    }
    public String getTitle(){
        return getText(By.cssSelector("[class='learntocodeh1']"));
    }

}
