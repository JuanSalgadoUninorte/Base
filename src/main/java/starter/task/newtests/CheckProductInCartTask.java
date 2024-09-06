package starter.task.newtests;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.login.AddToCart;
import starter.ui.login.Cart;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CheckProductInCartTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(AddToCart.GO_TO_CART, isVisible()).forNoMoreThan(30).seconds().then(Click.on(AddToCart.GO_TO_CART)),
                WaitUntil.the(Cart.QUANTITY, isVisible()).forNoMoreThan(30).seconds()
        );
    }
}
