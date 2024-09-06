package starter.questions;

import net.serenitybdd.screenplay.Question;
import starter.ui.login.Cart;

public class CartValidations {
    public static Question<Boolean> existance() {
        return actor -> Cart.QUANTITY.resolveFor(actor).isVisible();
    }
    public static Question<Boolean> nameValidation() {
        return actor -> Cart.PRODUCT_NAME.resolveFor(actor).isVisible();
    }

    public static Question<String> newNameValidation() {
        return actor -> Cart.PRODUCT_NAME.resolveFor(actor).getText().trim();
    }
}