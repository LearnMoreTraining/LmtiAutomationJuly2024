package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.ReadExcel;

import java.io.IOException;

public class HomePage {

    WebDriver driver ;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void selectValueFromCatergoryDropdown(){

    }

    public void enterProductName(String productName){

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
    }


    public void enterProductNameFromExcel() throws IOException {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(ReadExcel.getDataFromExcel("ProductDeatils",0,0));
    }

    public void clickSearchIcon(){

        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public void clickBabyWishList(){
        WebElement element = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(element).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).click();
    }
}
