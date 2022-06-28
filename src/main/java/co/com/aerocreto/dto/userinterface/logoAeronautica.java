package co.com.aerocreto.dto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class logoAeronautica extends PageObject {

public static final Target VALIDAR_IMAGENAERO = Target.the("visualiza el logo Aeronauticacivil").located(By.xpath("//ul[@class='logosHeader']//img[@alt='default.aspx']"));

}
