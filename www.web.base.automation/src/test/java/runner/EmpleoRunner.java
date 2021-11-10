package runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Empleo.feature",
        plugin = {"pretty"},
        //En esta parte indicar que feauture vamos a ejecutar
        glue= "stepsdefinition"
)

public class EmpleoRunner {


}


