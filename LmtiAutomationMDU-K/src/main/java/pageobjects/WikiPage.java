package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikiPage {
    WebDriver driver ;

    public WikiPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getShareholderValues(){

       int columnSize = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();
        for(int i=0 ; i < columnSize ; i++ ){

           String shareholderText= driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(i).getText();
            System.out.println(shareholderText);
        }

    }

    public void getShareHoldingValue(){

        int columnTwoSize = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).size();
        for(int j= 0 ; j < columnTwoSize;j++){
         String shareHoldingValue=   driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).get(j).getText();
            System.out.println(shareHoldingValue);
        }
    }

    public void getInfyColumnOneValue(){
       int size = driver.findElements(By.xpath("//table[@class='infobox vcard']/child::tbody/descendant::th")).size();
        for(int k = 0 ; k < size ;k++){

           String val = driver.findElements(By.xpath("//table[@class='infobox vcard']/child::tbody/descendant::th")).get(k).getText();
            System.out.println(val);
        }
    }

    public void getInfyColumnTwoValue(){
        int size = driver.findElements(By.xpath("//table[@class='infobox vcard']/child::tbody/descendant::td")).size();
        for(int k = 2 ; k < size ;k++){
            String val = driver.findElements(By.xpath("//table[@class='infobox vcard']/child::tbody/descendant::td")).get(k).getText();
            System.out.println(val);
        }
    }



}
