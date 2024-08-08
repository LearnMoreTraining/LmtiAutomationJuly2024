package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpiceBookingPage {
    WebDriver driver;
    public SpiceBookingPage(WebDriver driver) {
            this.driver = driver;
    }


    public void selectFromCity(String fromCity){
        driver.findElement(By.xpath("//input[@name='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
        driver.findElement(By.xpath("//a[@value='"+fromCity+"']")).click();
    }

    public void selectToCity(){

    }
}
