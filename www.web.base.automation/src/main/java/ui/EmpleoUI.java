package ui;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://valid.com/es/")
public class EmpleoUI extends PageObject {

    public static final Target BTN_EMPLEO = Target.the("Boton de Empleo").located(By.id("menu-item-4521"));

}
