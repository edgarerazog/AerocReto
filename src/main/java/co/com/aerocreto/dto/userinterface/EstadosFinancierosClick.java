package co.com.aerocreto.dto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EstadosFinancierosClick extends PageObject {
    public static final Target CLICK_ESTADOSFINANCIEROS = Target.the("Click en EstadosFinancieros").located(By.xpath("//li[@role='menuitem']//a[@title='Estados financieros']"));

}
