package co.com.aerocreto.dto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class clickBusqueda extends PageObject {

    //public static final Target DROWNLIST_TIPO_TRANSPARENCIA = Target.the("despliega la lista de Transparencia").located(By.xpath("//li[@class='static dynamic-children'][4]"));
    //public static final Target ITEM_PRESUPUESTO = Target.the("selecciona la opcion Presupuesto").located(By.xpath("/select[@id='Presupuesto']"));
public static final Target INPUT_BUSCADOR = Target.the("Ingresar la palabra Busqueda").located(By.xpath("//input[@type='text']"));
public static final Target CLICK_BUSCADOR = Target.the("Click en el Buscador").located(By.xpath("//a[@title='Realiza búsquedas'] "));

}
