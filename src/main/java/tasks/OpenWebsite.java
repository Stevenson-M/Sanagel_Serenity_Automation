package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenWebsite implements Task {
    private final String url;

    public OpenWebsite(String url) {
        this.url = url;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }

    public static Performable at(String url) {
        return new OpenWebsite(url);
    }
}
