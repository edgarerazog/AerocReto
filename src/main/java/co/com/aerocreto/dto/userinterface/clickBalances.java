package co.com.aerocreto.dto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class clickBalances extends PageObject {
    public static final Target CLICK_BALANCES = Target.the("Click en Balances").located(By.xpath("//div[@class='ms-rtestate-field' and contains(text(),'Balances')]"));

}
