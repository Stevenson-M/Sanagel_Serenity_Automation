package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {

    public static final Target productQuantity = Target.the("productQuantity").located(By.xpath("//input[@class='input-text qty text' and @type='number']"));

    public static final Target addToCartButton = Target.the("Add to Cart Button")
            .located(By.xpath("//button[@class='single_add_to_cart_button button alt' and contains(text(),'Añadir al carrito')]"));

    public static final Target extraProduct2 = Target.the("product 2")
            .locatedBy("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']");

}

