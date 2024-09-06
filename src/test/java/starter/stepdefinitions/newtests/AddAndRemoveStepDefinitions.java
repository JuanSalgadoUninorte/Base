package starter.stepdefinitions.newtests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import starter.questions.CartValidations;
import starter.task.loginsaucelabs.CompleteLoginTask;
import starter.task.newtests.AddProductToCartTask;
import starter.task.newtests.CheckProductInCartTask;
import starter.task.newtests.RemoveProductFromCartTask;

import static org.hamcrest.CoreMatchers.equalTo;

public class AddAndRemoveStepDefinitions {
    @Given("^(.*) enters and logs in to SauceLabs")
    public void enters_and_logs_in_to_sauce_labs(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(Open.browserOn().thePageNamed("pages.saucelabs"));
        OnStage.theActorInTheSpotlight().attemptsTo(new CompleteLoginTask());
    }
    @When("A product is added to the cart")
    public void a_product_is_added_to_the_cart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                new AddProductToCartTask(),
                new CheckProductInCartTask()
        );
    }
    @When("It is removed")
    public void it_is_removed() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(CartValidations.existance(), equalTo(true)),
                GivenWhenThen.seeThat(CartValidations.nameValidation(), equalTo(true))
        );
        OnStage.theActorInTheSpotlight().attemptsTo(
                new RemoveProductFromCartTask()
        );
    }
    @Then("The cart must be empty")
    public void the_cart_must_be_empty() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(CartValidations.existance(), equalTo(false))
        );
    }
}
