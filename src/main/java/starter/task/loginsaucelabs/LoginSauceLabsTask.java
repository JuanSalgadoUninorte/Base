package starter.task.loginsaucelabs;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.login.LoginUI;

public class LoginSauceLabsTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("problem_user").into(LoginUI.INPUT_USERNAME),
                Enter.theValue("secret_sauce").into(LoginUI.INPUT_PASSWORD)
        );
    }
}
