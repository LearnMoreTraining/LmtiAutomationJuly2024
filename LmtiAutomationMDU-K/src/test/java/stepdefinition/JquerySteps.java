package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utility.TestContext;

public class JquerySteps {

    TestContext context;

    public JquerySteps(TestContext context){
        this.context = context;
    }

    @Given("user perform drag and drop operation")
    public void dragAndDrop(){
        context.pageObjectManager.getJqueryPage().performDragAndDrop();
    }

    @Then("verify the status displayed as dropped")
    public void verifyTheStatusDisplayedAsDropped() {
       String message = context.pageObjectManager.getJqueryPage().getDroppedText();
        Assert.assertEquals("Dropped!",message);
    }
}
