package utility;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class BrowserBase {

   public WebDriver driver ;

    public WebDriver getDriver() throws IOException {

        if(driver == null) {
            File f = new File("src/main/resources/configurations/frameworkconfig.properties");
            FileInputStream fis = new FileInputStream(f);
            Properties prob = new Properties();
            prob.load(fis);
//        if(prob.getProperty("browser").equalsIgnoreCase("chrome")){
//            driver = new ChromeDriver();
//        }
//        else if (prob.getProperty("browser").equalsIgnoreCase("edge")){
//            driver = new EdgeDriver();
//        }
//        else if (prob.getProperty("browser").equalsIgnoreCase("safari")){
//            driver = new SafariDriver();
//        }
//        else{
//            throw new InvalidArgumentException("enter valid browser");
//        }

            switch (prob.getProperty("browser").toLowerCase()) {

                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                default:
                    throw new InvalidArgumentException("enter valid browser name");
            }


            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(prob.getProperty("testenvironemnt"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        }
        return driver;
    }
}
