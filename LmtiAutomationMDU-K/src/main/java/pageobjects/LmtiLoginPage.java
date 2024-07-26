package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LmtiLoginPage {

    WebDriver driver;
    public LmtiLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(){
        driver.findElement(By.id("username")).sendKeys("lmti");
    }

    public void enterPassword(){
        driver.findElement(By.id("password")).sendKeys("123");
    }

    public void clickLoginButton(){

        driver.findElement(By.xpath("//button[text()='Login']")).click();
    }

    public String getErrorMessage(){
       return driver.findElement(By.id("errorMessage")).getText();
    }
}
