package StepDefinition;

import Pages.HomePage;
import Pages.ProductDisplayPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MySeleniumStepdefs extends BaseSteps {


    @Given("I am on the Automation Practice Homepage")
    public void iAmOnTheAutomationPracticeHomepage() {
        HomePage.GoToHomePage();
    }

    @When("^I click on the (Dresses|T-shirts) button$")
    public void iClickOnTheDressesButton(String category) {
        HomePage.SelectNavBarCategory(category);
    }

    @Then("^the (Dresses|T-shirts) page is displayed$")
    public void theDressesPageIsDisplayed(String pageName) {
        System.out.println("Asserting the " + pageName + " page is displayed");
        Assert.assertEquals(ProductDisplayPage.getCurrentProductPage(), pageName);
    }
}
