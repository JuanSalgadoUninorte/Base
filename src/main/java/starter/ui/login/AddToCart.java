package starter.ui.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddToCart {
    public static final Target PRODUCTS =  Target.the("Title to validate").located(By.xpath("//span[contains(text(), 'Products')]"));
    public static final Target ADD_TO_CART_BACKPACK =  Target.the("Add to cart").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target GO_TO_CART =  Target.the("Go to cart").located(By.xpath("//a[@class='shopping_cart_link']"));
}
