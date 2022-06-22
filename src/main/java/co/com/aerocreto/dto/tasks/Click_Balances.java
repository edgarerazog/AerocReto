package co.com.aerocreto.dto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.aerocreto.dto.userinterface.BalancesClick.CLICK_BALANCES;
import static co.com.aerocreto.dto.userinterface.EstadosFinancierosClick.CLICK_ESTADOSFINANCIEROS;

public class Click_Balances implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CLICK_BALANCES));
    }
    public static Performable click_Balances(){ return Tasks.instrumented(Click_Balances.class);

    }
}
