package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utility.TestContext;

public class WikiSteps {

    TestContext context;

    public WikiSteps(TestContext context){
        this.context = context;
    }

    @Given("user extracts the share holder value from Infosys shareholding and stakeholders pattern table")
    public void extractShareHolderValue(){
        context.pageObjectManager.getWikiPage().getShareholderValues();
    }

    @When("user extracts the share holding value from Infosys shareholding and stakeholders pattern table")
    public void extractShareHoldingValue() {
        context.pageObjectManager.getWikiPage().getShareHoldingValue();
    }

    @Given("user extracts the column one and two values")
    public void userExtractsTheColumnOneAndTwoValues() {

        context.pageObjectManager.getWikiPage().getInfyColumnOneValue();
        context.pageObjectManager.getWikiPage().getInfyColumnTwoValue();
    }
}
