package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class SelectProductQuantity implements Task {

    private final String quantity;
    private final Target target;

    public SelectProductQuantity(String quantity, Target target) {
        this.quantity = quantity;
        this.target = target;
    }

    public static SelectProductQuantity ofQuantity(String quantity, Target target) {
        return new SelectProductQuantity(quantity, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(quantity).into(target).thenHit(Keys.ENTER)
        );
    }
}
