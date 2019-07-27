package test.definitionsteps;

import com.test.steps.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ApiDefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("I Set GET method api endpoint '$city'")
    public void givenISetGETMethodApiEndpointLondon(String city) {

    }


    @When("I Send GET HTTP request")

    public void whenSendGETHTTPRequest() {

    }

    @Then("I receive valid HTTP response code '$200'")
    public void thenIReceiveValidHTTPResponseCode200(int statusCode) {

    }

    @Then("Response body contains attribute 'City' is 'London'")
    public void thenResponseBodyContainsAttributeCityIsLondon(String attribute, String city) {

    }

}
