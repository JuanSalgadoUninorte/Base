package starter.ui.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardProducts {
    public static final Target PRODUCTS =  Target.the("Title to validate").located(By.xpath("//span[contains(text(), 'Products')]"));
}
