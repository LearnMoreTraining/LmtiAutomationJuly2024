package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.TestContext;

import java.io.IOException;

public class Hooks {

    TestContext context;
    public Hooks(TestContext context){
        this.context = context;
    }

    @Before()
    public void preCondition(){
        System.out.println("execution started");
    }

    @After()
    public void postCondition() throws IOException {
        System.out.println("execution ended");
      //  context.base.getDriver().close();
    }
}
