package co.com.aerocreto.dto.question.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.aerocreto.dto.userinterface.logoAeronautica.VALIDAR_IMAGENAERO;

public class ValidarInicio implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return VALIDAR_IMAGENAERO.resolveFor(actor).isPresent();
    }
    public static ValidarInicio LogoAeronautica(){
        return new ValidarInicio();
        
    }
}
