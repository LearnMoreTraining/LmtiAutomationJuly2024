package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JqueryPage {

    WebDriver driver ;

    public JqueryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void performDragAndDrop(){
     //   WebElement frameElement = driver.findElement(By.className("demo-frame"));
        WebElement frameElement = driver.findElement(By.cssSelector(".demo-frame"));
        driver.switchTo().frame(frameElement);
       // WebElement dragMe = driver.findElement(By.id("draggable"));
        WebElement dragMe = driver.findElement(By.cssSelector("#draggable"));
        WebElement dropMe = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMe,dropMe).build().perform();

    }

    public String getDroppedText(){

      return  driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();

    }
}
