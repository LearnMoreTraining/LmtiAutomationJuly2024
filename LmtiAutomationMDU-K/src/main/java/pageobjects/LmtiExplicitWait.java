package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LmtiExplicitWait {
    WebDriver driver;

    public LmtiExplicitWait(WebDriver driver){
        this.driver = driver;
    }

    public void clickChangeTextButton(){
      //  driver.findElement(By.cssSelector("#quote")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",driver.findElement(By.cssSelector("#quote")));
    }

    public void scroll(){

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
        jse.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.cssSelector("#quote")));
    }

    public String getChangeText(){

        String text ;
        try{

          text = driver.findElement(By.xpath("//*[text()='abc']")).getText();
        }
        catch(NoSuchElementException e){

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.pollingEvery(Duration.ofSeconds(5))  ;
            wait.ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Hello, Learn More Aspirants']")));
          text = driver.findElement(By.xpath("//*[text()='Hello, Learn More Aspirants']")).getText();

        }


        return text;


    }



}
