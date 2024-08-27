package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
        context.base.getDriver().close();
    }

    @AfterStep()
    public void takeScreenshot(Scenario sc) throws IOException {

       TakesScreenshot ts = (TakesScreenshot)context.base.getDriver();
       byte[] p = ts.getScreenshotAs(OutputType.BYTES);
       sc.attach(p,"image/png",sc.getName());

    }
}
