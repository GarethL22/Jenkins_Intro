package StepDefinition;

import env.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

    @Before
    public void before(){
        System.out.println("Setting up the driver");
        WebDriverManager.chromedriver().setup();
        DriverUtil.getDefaultDriver();
    }

    @After
    public void after(){
        System.out.println("Clearing down the driver");
        DriverUtil.tearDownDriver();
    }
}
