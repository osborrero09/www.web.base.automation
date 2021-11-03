package SprintUno;

import SprintUno.Steps.UsuarioTakami;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class CuandoIniciamosSesion {

    @Steps
    UsuarioTakami oswaldo;

    @Managed
    WebDriver driver;



    @Test
    public void deberia_acceder_a_mi_perfil() throws InterruptedException {


        oswaldo.ingresar_a_Takami();

        oswaldo.ingresa_usuario("jhon.celis", "12345");

        oswaldo.click_boton();

        oswaldo.confirmar_ingreso();



    }
}
