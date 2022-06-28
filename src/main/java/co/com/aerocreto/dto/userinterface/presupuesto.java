package co.com.aerocreto.dto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class presupuesto extends PageObject {

    public static final Target CLICK_PRESUPUESTO = Target.the("Click en Presupuesto").located(By.xpath("//a[@clicktype='Result' and @title= 'Presupuesto']"));

}
