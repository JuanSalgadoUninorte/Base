package starter.ui.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static final Target INPUT_USERNAME =  Target.the("User field").located(By.id("user-name"));
    public static final Target INPUT_PASSWORD =  Target.the("Password field").located(By.id("password"));
    public static final Target LOGIN_BUTTON =  Target.the("Login button").located(By.xpath("//*[@id=\"login-button\"]"));
}
