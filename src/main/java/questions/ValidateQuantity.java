package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateQuantity implements Question<Integer> {

    private Target target;

    public ValidateQuantity(Target target) {
        this.target = target;
    }

    @Override
    public Integer answeredBy(Actor actor) {
        String quantityText = target.resolveFor(actor).getValue();
        return Integer.parseInt(quantityText);
    }

    public static ValidateQuantity displayedQuantity(Target target) {
        return new ValidateQuantity(target);
    }
}


