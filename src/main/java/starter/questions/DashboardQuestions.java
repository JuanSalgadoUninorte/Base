package starter.questions;

import net.serenitybdd.screenplay.Question;
import starter.ui.login.DashboardProducts;

public class DashboardQuestions {
    public static Question<String> dashboardTitle() {
        return actor -> DashboardProducts.PRODUCTS.resolveFor(actor).getText().trim();
    }
    public static Question<Boolean> testDashboardTitle() {
        return actor -> DashboardProducts.PRODUCTS.resolveFor(actor).isVisible();
    }
}
