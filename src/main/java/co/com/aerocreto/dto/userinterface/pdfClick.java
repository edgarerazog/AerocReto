package co.com.aerocreto.dto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class pdfClick extends PageObject {
    public static final Target CLICK_PDF = Target.the("Click en descargar PDF").located(By.xpath("//a[@class='tool-doc download' and @title= 'Estado de Situación Financiera a 31 de marzo de 2022']"));
    public static final Target CLICK_ABRIRPDF = Target.the("Click en abrir el PDF").located(By.xpath("//a[@class='link-img-container' and @title= 'Estado de Situación Financiera a 31 de marzo de 2022']"));
    public static final Target CLICK_GUARDARPDF = Target.the("Click en la flecha el PDF").located(By.id("file-download"));


}
