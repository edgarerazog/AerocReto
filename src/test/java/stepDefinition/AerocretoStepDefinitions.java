package stepDefinition;

import co.com.aerocreto.dto.tasks.*;
import co.com.aerocreto.dto.util.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class AerocretoStepDefinitions {

    @Before
    public void setUp() { OnStage.setTheStage(new OnlineCast()); }

    @Given("el cliente ingresa a la pagina web para realizar la descarga del archivo pdf Estado de situacion Financiera de marzo del presente año")
    public void elClienteIngresaALaPaginaWebParaRealizarLaDescargaDelArchivoPdfEstadoDeSituacionFinancieraDeMarzoDelPresenteAño() {
        theActorCalled(Constants.ACTOR).wasAbleTo(OpenWebAerocReto.openWebAerocReto());
        //theActorCalled(Constants.ACTOR).wasAbleTo(Click_Busqueda.click_Transparencia());
        //theActorCalled(Constants.ACTOR).wasAbleTo(Click_Busqueda.click_Transparencia());
        theActorCalled(Constants.ACTOR).attemptsTo(Click_Busqueda.click_Busqueda());
        theActorCalled(Constants.ACTOR).attemptsTo(Resultado_Busqueda.resultado_Busqueda());
        theActorCalled(Constants.ACTOR).attemptsTo(Click_EstadosFinancieros.click_EstadosFinancieros());
        theActorCalled(Constants.ACTOR).attemptsTo(Click_Balances.click_Balances());


    }
    @When("cuando este en la opcion Estados financiero ingresar a la casilla Balances y descargar el PDF de marzo del presente año")
    public void cuandoEsteEnLaOpcionEstadosFinancieroIngresarALaCasillaBalancesYDescargarElPDFDeMarzoDelPresenteAño() {

    }
    @Then("Validar que el PDF descargado sea el correcto")
    public void validarQueElPDFDescargadoSeaElCorrecto() {

    }
}
