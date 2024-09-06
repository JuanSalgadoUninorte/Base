package starter.task.loginsaucelabs;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class CompleteLoginTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                new LoginSauceLabsTask(),
                new ClickButton()
        );
    }
}
