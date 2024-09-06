package starter.task.loginsaucelabs;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.login.LoginUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickButton implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(LoginUI.LOGIN_BUTTON, isVisible()).forNoMoreThan(30).seconds().then(Click.on(LoginUI.LOGIN_BUTTON)));
    }
}
