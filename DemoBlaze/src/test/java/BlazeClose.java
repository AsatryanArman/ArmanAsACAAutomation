import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

public class BlazeClose extends BlazeLogIn {
    @AfterTest
    public void close ()  {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.quit();
    }
}