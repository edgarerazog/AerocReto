package co.com.aerocreto.dto.tasks;

import co.com.aerocreto.dto.util.Constants;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AbrirlaPaginaDeAero implements Task {
    private EnvironmentVariables environmentVariables;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String paginaWebUrl = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(Constants.PAGINA_WEB_URL_AUTOMATION_PRACTICE);
        actor.attemptsTo(Open.url(paginaWebUrl));
        BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().manage().window().maximize();

        try {
            File theDir = new File("Grabacion");
            if (!theDir.exists()) {
                theDir.mkdirs();
            }


            LocalDateTime myObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
            String formattedDate = myObj.format(myFormatObj);
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "ffmpeg -y -rtbufsize 100M -f gdigrab -t 00:00:30 -framerate 30 -probesize 10M -draw_mouse 1 -i desktop -c:v libx264 -r 30 -preset ultrafast -tune zerolatency -crf 25 -pix_fmt yuv420p Grabacion\\" + formattedDate + ".mp4");
            builder.redirectErrorStream(true);
            Process p = builder.start();


        } catch (Exception e) {

        }
    }
    public static Performable abrirlaPaginaDeAero(){ return Tasks.instrumented(AbrirlaPaginaDeAero.class);
    }
}
