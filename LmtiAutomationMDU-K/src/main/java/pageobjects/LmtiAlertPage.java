package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LmtiAlertPage {

    WebDriver driver;

    public LmtiAlertPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickConfirmBoxButton(){
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    }

    public void clickCancelButton(){

        driver.switchTo().alert().dismiss();
    }

    public String getConfirmBoxText(){
       String val = driver.switchTo().alert().getText();
       return val;
    }

    public String getUiText(){
      return  driver.findElement(By.id("demo")).getText();
    }
}
