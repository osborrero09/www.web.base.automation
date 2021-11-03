package SprintUno.Steps;

import SprintUno.pageobject.PaginaTakami;
import net.thucydides.core.annotations.Step;

import static java.lang.Thread.sleep;


public class UsuarioTakami {

     PaginaTakami TeslaTakami;


    @Step
    public void ingresar_a_Takami() {
        TeslaTakami.openUrl("https://lab-takami-tesla.validsolutions.com.br/#/auth/login");
    }


    @Step
    public void ingresa_usuario (String usuario, String claveUsuario) {
        TeslaTakami.id_Usiario(usuario,claveUsuario);

    }

    @Step
    public void click_boton (){

        TeslaTakami.enviarDatos();
    }

    @Step
    public void confirmar_ingreso () throws InterruptedException {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sleep(2000);
        TeslaTakami.confirmar();

    }



}
