package co.com.aerocreto.dto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.aerocreto.dto.userinterface.clickBalances.CLICK_BALANCES;

public class IngresarA_losBalances implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CLICK_BALANCES));
    }
    public static Performable ingresarA_losBalances(){ return Tasks.instrumented(IngresarA_losBalances.class);

    }
}
