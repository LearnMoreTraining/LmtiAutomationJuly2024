package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BabyWishPage {

    WebDriver driver; //null

    public BabyWishPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterBabyWishListName(String wishListName){

        driver.findElement(By.id("find-list-input")).sendKeys(wishListName);
    }

    public String getBabyWishListText(){

      String val =  driver.findElement(By.xpath("//h2[text()='Baby Wishlist']")).getText();
       return val ;
    }
}
