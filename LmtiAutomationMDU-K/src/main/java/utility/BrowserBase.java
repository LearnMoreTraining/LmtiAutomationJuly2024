package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;


public class BrowserBase {

   public WebDriver driver ;

    public WebDriver getDriver() throws IOException {

        driver = new ChromeDriver();
        driver.get(" https://jqueryui.com/droppable/");
        return driver;
    }
}
