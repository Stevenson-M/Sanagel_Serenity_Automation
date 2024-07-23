package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOn implements Task {

    private Target product;

    public ClickOn(Target product) {
        this.product = product;
    }

    public static ClickOn ofTarget(Target product) {
        return new ClickOn(product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(product)
        );
    }
}
