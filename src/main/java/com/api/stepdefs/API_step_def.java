package com.api.stepdefs;

import com.api.utility.Support;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class API_step_def {

    private Support support = new Support();

    public API_step_def() {
        support = new Support();
    }


    @When("^the performs a GET request to the \"([^\"]*)\"$")
    public void thePerformsAGETRequestToThe(String endpoint) throws Throwable {
        endpoint = Support.getConfigDataFileData(endpoint);
        support.getRequest(endpoint);
    }

    @When("^the user sends a \"([^\"]*)\" request \"([^\"]*)\" to the \"([^\"]*)\" with a higher salary$")
    public void theUserSendsAPOSTRequestToThe(String requestType, String jsonFile, String endpoint) throws Throwable {
        endpoint = Support.getConfigDataFileData(endpoint);


        if ("POST".equals(requestType)) {
            support.postRequest(jsonFile, endpoint);
        }
    }


    @Then("^the user gets a \"([^\"]*)\" successful response$")
    public void theUserGetsASuccessfulResponse(int status) throws Throwable {
        support.verifyResponseCode(status);
    }

    @And("^the total number of employees is printed on screen$")
    public void theTotalNumberOfEmployeesIsPrintedOnScreen() throws Throwable {
        support.printTotalEmployees();
    }

    @And("^the name of the employee with maximum ID value is printed on screen$")
    public void theNameOfTheEmployeeWithMaximumIDValueIsPrintedOnScreen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^a list of employees with salaries > (\\d+) is printed on screen$")
    public void aListOfEmployeesWithSalariesIsPrintedOnScreen(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
