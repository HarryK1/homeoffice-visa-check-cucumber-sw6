package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.SelectNationalityPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountryDropDownSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I click on start button")
    public void iClickOnStartButton() {
    }

    @Then("I can see following {string} into dropdown")
    public void iCanSeeFollowingCountryIntoDropdown() {
        new SelectNationalityPage().selectNationality("country");
        }
}

