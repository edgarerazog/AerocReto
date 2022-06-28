package co.com.aerocreto.dto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.aerocreto.dto.userinterface.pdfClick.*;

public class Realizar_laDescargarDelPDF implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CLICK_PDF));
        //actor.attemptsTo(Click.on(CLICK_ABRIRPDF));
        //actor.attemptsTo(Click.on(CLICK_GUARDARPDF));
    }


    public static Performable realizar_laDescargarDelPDF(){ return Tasks.instrumented(Realizar_laDescargarDelPDF.class);
    }
}
