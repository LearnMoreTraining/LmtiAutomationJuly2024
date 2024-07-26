package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utility.TestContext;

public class LmtiSteps {

    TestContext context;

    public LmtiSteps(TestContext context){
        this.context = context;
    }

    @Given("user enter username and password")
    public void enterCredit(){
        context.pageObjectManager.getLmtiLoginPage().enterUserName();
        context.pageObjectManager.getLmtiLoginPage().enterPassword();
    }

    @When("user clicks the login button")
    public void userClicksTheLoginButton() {
        context.pageObjectManager.getLmtiLoginPage().clickLoginButton();
    }

    @Then("user validate the error message")
    public void userValidateTheErrorMessage() {

        Assert.assertEquals("Invalid Credentials.",context.pageObjectManager.getLmtiLoginPage().getErrorMessage());
    }
}
