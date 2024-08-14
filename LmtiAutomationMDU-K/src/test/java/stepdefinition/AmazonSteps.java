package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import pageobjects.BabyWishPage;
import pageobjects.HomePage;
import utility.BrowserBase;
import utility.TestContext;

import java.io.IOException;

public class AmazonSteps {

    TestContext context;

    public AmazonSteps(TestContext context){
        this.context = context;
    }

    @Given("user navigates to baby wishlist page")
    public void navigation(){
       context.pageObjectManager.getHomePage().clickBabyWishList();
    }

    @Then("validate the Baby wish list text")
    public void validateTheBabyWishListText() {

        Assert.assertEquals("Baby Wishlist",context.pageObjectManager.getBabyWishList().getBabyWishListText());


    }


    @Given("user enter the product details")
    public void userEnterTheProductDetails() throws IOException {
        context.pageObjectManager.getHomePage().enterProductName("sheet1",1,2);
    }
}
