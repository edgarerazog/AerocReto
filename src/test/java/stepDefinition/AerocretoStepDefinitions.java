package stepDefinition;

import co.com.aerocreto.dto.helpers.abilities.ReadPdf;
import co.com.aerocreto.dto.helpers.hooks.DeletePdfFiles;
import co.com.aerocreto.dto.question.home.ValidarInicio;
import co.com.aerocreto.dto.tasks.*;
import co.com.aerocreto.dto.util.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.util.EnvironmentVariables;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AerocretoStepDefinitions {
    private EnvironmentVariables environmentVariables;
    String downloadFolder;
    String fileName;

    @Before
    public void setUp() { OnStage.setTheStage(new OnlineCast()); }

    @Given("el cliente ingresa a la pagina web para realizar la descarga del archivo pdf Estado de situacion Financiera de marzo del presente año")
    public void elClienteIngresaALaPaginaWebParaRealizarLaDescargaDelArchivoPdfEstadoDeSituacionFinancieraDeMarzoDelPresenteAño() {
        downloadFolder = environmentVariables.optionalProperty("download.filesFolder")
                .orElseThrow(IllegalArgumentException::new);

        fileName = environmentVariables.optionalProperty("statements.fileName")
                .orElseThrow(IllegalArgumentException::new);

        theActorCalled(Constants.ACTOR).wasAbleTo(AbrirlaPaginaDeAero.abrirlaPaginaDeAero());
        //theActorCalled(Constants.ACTOR).wasAbleTo(Click_Busqueda.click_Transparencia());
        //theActorCalled(Constants.ACTOR).wasAbleTo(Click_Busqueda.click_Transparencia());
        theActorInTheSpotlight().should(seeThat(ValidarInicio.LogoAeronautica()));
        theActorCalled(Constants.ACTOR).wasAbleTo(IngresaraLaOpcionDeBusqueda.ingresaraLaOpcionDeBusqueda(),
        VisualizarlosResultadosDeLaBusqueda.visualizarlosResultadosDeLaBusqueda(),
        AccederaLosEstadosFinancieros.accederaLosEstadosFinancieros(),
        IngresarA_losBalances.ingresarA_losBalances());

    }
    @When("cuando este en la opcion Estados financiero ingresar a la casilla Balances y descargar el PDF de marzo del presente año")
    public void cuandoEsteEnLaOpcionEstadosFinancieroIngresarALaCasillaBalancesYDescargarElPDFDeMarzoDelPresenteAño() {
        theActorCalled(Constants.ACTOR).attemptsTo(Realizar_laDescargarDelPDF.realizar_laDescargarDelPDF());

    }
    @Then("Validar que el PDF descargado sea el correcto")
    public void validarQueElPDFDescargadoSeaElCorrecto() throws IOException {

        String statementFilePath = String.format("%s/%s", downloadFolder, fileName);

        theActorInTheSpotlight().whoCan(ReadPdf.downloadedInPath(statementFilePath));

        String pdfText = ReadPdf.as(theActorInTheSpotlight()).getText();

        System.out.println(pdfText);
        DeletePdfFiles.isAStatement(fileName);

    }
}
