package utility;

import org.openqa.selenium.WebDriver;
import pageobjects.*;

public class PageObjectManager {

    WebDriver driver;
    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public BabyWishPage getBabyWishList(){
        BabyWishPage babyWishPage = new BabyWishPage(driver);
        return babyWishPage;
    }

    public HomePage getHomePage(){
        HomePage homePage = new HomePage(driver);
        return homePage;
    }

    public ProductSpecifcPage getProductSpecificPage(){
        ProductSpecifcPage pageObjectManager = new ProductSpecifcPage(driver);
        return pageObjectManager;
    }

    public ResultPage getResultPage(){
        ResultPage resultPage = new ResultPage(driver);
        return resultPage;
    }

    public LmtiAlertPage getAlertPage(){
        LmtiAlertPage alertPage = new LmtiAlertPage(driver);
        return alertPage;
    }

    public LmtiLoginPage getLmtiLoginPage(){
        LmtiLoginPage loginPage = new LmtiLoginPage(driver);
        return loginPage;
    }

    public JqueryPage getJqueryPage(){
        JqueryPage jqueryPage = new JqueryPage(driver);
        return jqueryPage;
    }

    public WikiPage getWikiPage(){
        WikiPage wikiPage = new WikiPage(driver);
        return wikiPage;
    }


}
