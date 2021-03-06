package org.Valid.qa.automation.taller.tasks;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.concurrent.TimeUnit;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
	
		/*
		 * Clase Runner donde se indican los features a ejecutar
		 */
		plugin = {"pretty"},
		//En esta parte indicar que feauture vamos a ejecutar
		features = "src/test/java/features/Empleo.feature",
		glue= "steps"
					
)
public class Runner {
    public static WebDriver chromeDriver;
   
    @BeforeClass
    public static void abrirDriver(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setCapability("marionette", false);
        chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }  
        
   
    @AfterClass
    public static void cerrarDriver() {
    	chromeDriver.close();
    	chromeDriver.quit();
        
    }
}
