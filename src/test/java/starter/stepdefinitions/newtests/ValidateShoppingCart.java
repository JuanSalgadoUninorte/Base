package starter.stepdefinitions.newtests;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import starter.questions.CartValidations;
import starter.task.newtests.CheckProductInCartTask;
import starter.task.newtests.ReturnToProducts;

import static org.hamcrest.CoreMatchers.equalTo;

public class ValidateShoppingCart {
    @When("It is checked that is in the cart the element {string}")
    public void it_is_checked_that_is_in_the_cart(String elementName) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(CartValidations.existance(), equalTo(true)),
                GivenWhenThen.seeThat(CartValidations.newNameValidation(), equalTo(elementName))
        );
    }

    @Then("The user must get out of it and check it again {string}")
    public void the_user_must_get_out_of_it_and_check_it_again(String elementName) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                new ReturnToProducts(),
                new CheckProductInCartTask()
        );
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(CartValidations.existance(), equalTo(true)),
                GivenWhenThen.seeThat(CartValidations.newNameValidation(), equalTo(elementName))
        );
    }
}
