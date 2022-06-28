package co.com.aerocreto.dto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.aerocreto.dto.userinterface.clickBusqueda.*;

public class IngresaraLaOpcionDeBusqueda implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Click.on(DROWNLIST_TIPO_TRANSPARENCIA));
        //actor.attemptsTo(MoveMouse.to(DROWNLIST_TIPO_TRANSPARENCIA));
        //actor.attemptsTo(Click.on(ITEM_PRESUPUESTO));
        actor.attemptsTo(Enter.theValue("Presupuesto").into(INPUT_BUSCADOR));
        actor.attemptsTo(Click.on(CLICK_BUSCADOR));



        //actor.attemptsTo(SelectFromOptions.byVisibleText("Transparencia").from(DROWNLIST_TIPO_TRANSPARENCIA));

    }
    public static Performable ingresaraLaOpcionDeBusqueda(){ return Tasks.instrumented(IngresaraLaOpcionDeBusqueda.class);
}
}