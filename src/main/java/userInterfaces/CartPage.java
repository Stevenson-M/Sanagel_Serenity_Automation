package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    public static final Target quantityInputOneCartPage = Target.the("Quantity Input product one")
            .located(By.xpath("//*[@id=\"quantity_66a02511bccd4\"]"));

    public static final Target quantityInputTwoCartPage = Target.the("Quantity Input product two")
            .locatedBy("//input[@class='input-text qty text' and @type='number']");
}
