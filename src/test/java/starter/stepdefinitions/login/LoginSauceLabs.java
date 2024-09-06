package starter.stepdefinitions.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import starter.questions.DashboardQuestions;
import starter.task.loginsaucelabs.ClickButton;
import starter.task.loginsaucelabs.LoginSauceLabsTask;

import static org.hamcrest.CoreMatchers.equalTo;

public class LoginSauceLabs {
    @Given("^(.*) access to the Saucelabs page")
    public void the_user_access_to_the_saucelabs_page(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(Open.browserOn().thePageNamed("pages.saucelabs"));
    }
    @When("It is written user and password")
    public void it_is_written_user_and_password() {
        OnStage.theActorInTheSpotlight().attemptsTo(new LoginSauceLabsTask());
    }
    @When("Clicks on the login button")
    public void clicks_on_the_login_button() {
        OnStage.theActorInTheSpotlight().attemptsTo(new ClickButton());

    }
    @Then("Must be visualized the Saucelabs products page {string}")
    public void must_be_visualized_the_saucelabs_products_page(String expectedTitle) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(DashboardQuestions.dashboardTitle(), equalTo(expectedTitle)),
                GivenWhenThen.seeThat(DashboardQuestions.testDashboardTitle(), equalTo(true))
        );
    }
}