package co.com.aerocreto.dto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.aerocreto.dto.userinterface.presupuesto.CLICK_PRESUPUESTO;

public class VisualizarlosResultadosDeLaBusqueda implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLICK_PRESUPUESTO));

    }
    public static Performable visualizarlosResultadosDeLaBusqueda(){ return Tasks.instrumented(VisualizarlosResultadosDeLaBusqueda.class);
    }

}
