package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utility.TestContext;

public class SpiceSteps {
    TestContext context;
    public SpiceSteps(TestContext context){
        this.context = context;
    }

    @Given("user select the value in from dropdown")
    public void selectFromValue(){
        context.pageObjectManager.getBookingPage().selectFromCity("COK");
    }

    @When("user select the value from To dropdown")
    public void userSelectTheValueFromToDropdown() {
    }
}
