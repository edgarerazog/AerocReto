package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/feature/aerocreto.feature"}
        , glue = {"stepDefinition"}
        , tags = "@pdf"
        , snippets =  CucumberOptions.SnippetType.CAMELCASE)
public class RunnerProcesodeDescargarPDF {
}
