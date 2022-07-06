package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    @Given("I am at a point")
    public void iAmAtAPoint() {
        System.out.println("I am a Given");
    }

    @When("I do a thing")
    public void iDoAThing() {
        System.out.println("I am a When");
    }

    @Then("Something will happen")
    public void somethingWillHappen() {
        System.out.println("I am a Then");
    }

}
