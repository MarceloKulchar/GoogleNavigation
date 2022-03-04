package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;


public class GoogleSteps {          

    GooglePage google = new GooglePage();
    
    @Given("^Im on the Google search page$")
    public void navigateToGoogle(){
        google.navigateToGoogle();
    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){

    }
    @And("^clic on the search buttom$")
    public void clicSearchButtom(){

    }
    @Then("^The results match the criteria$")
    public void validateResults(){

    }


}
