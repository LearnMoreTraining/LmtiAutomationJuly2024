package utility;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class BrowserBase {

   public WebDriver driver ;

    public WebDriver getDriver() throws IOException {
        File f = new File("src/main/resources/configurations/frameworkconfig.properties");
        FileInputStream fis = new FileInputStream(f);
        Properties prob = new Properties();
        prob.load(fis);
        if(prob.getProperty("browser").equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else if (prob.getProperty("browser").equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }
        else if (prob.getProperty("browser").equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }
        else{
            throw new InvalidArgumentException("enter valid browser");
        }

        driver.get(prob.getProperty("testenvironemnt"));
        return driver;
    }
}
