package starter.ui.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Cart {


    public static final Target QUANTITY =  Target.the("Elements quantity").located(By.xpath("//div[@class='cart_quantity']"));
    public static final Target REMOVE_ELEMENT =  Target.the("Elements removement").located(By.id("remove-sauce-labs-backpack"));
    public static final Target PRODUCT_NAME =  Target.the("Element name").located(By.xpath("//*[@class='inventory_item_name']"));
    public static final Target CONTINUE_SHOPPING =  Target.the("Continue shopping").located(By.xpath("//*[@id='continue-shopping']"));
}
