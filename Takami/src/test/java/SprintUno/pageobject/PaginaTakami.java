package SprintUno.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import java.util.Objects;

import static net.serenitybdd.screenplay.ensure.Ensure.*;
import static org.junit.Assert.assertEquals;


//@DefaultUrl("https://lab-takami-tesla.validsolutions.com.br/#/auth/login")

public class PaginaTakami extends PageObject {

    @FindBy (id = "username")
    WebElementFacade nombreUsuaio;

    @FindBy (id = "password")
    WebElementFacade claveUsuario;

    @FindBy(xpath = "/html/body/app-root/app-auth-layout/blockable-div/div/div/div/div/div[2]/app-login/div/form/div[3]/div/div[1]/button")
    WebElementFacade botonINgresar;

    @FindBy(xpath = "/html/body/app-root/app-content-layout/app-nav/header/nav/app-user-options/div/ul/li[1]/div/button")
    WebElementFacade paginaCargada;



    public void id_Usiario(String usuario, String clave_Usuario) {
        nombreUsuaio.type(usuario);
        claveUsuario.type(clave_Usuario);

    }


    public void enviarDatos() {

        botonINgresar.click();
    }

    public void confirmar() {
        //WebDriverWait wait = new WebDriverWait(30);
        paginaCargada.isDisplayed();
    }
}
