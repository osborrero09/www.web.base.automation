package org.Valid.qa.automation.taller.ui;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import ui.PaginaPrincipalPage;


public class EmpleoStep{
	
	/*
	 * Aqui se implementan los steps resultantes del feature
	 */
	@Before
	public void set_the_stage() {
		OnStage.setTheStage(new OnlineCast());

	}
	
	public WebDriver driver =null;
	
	 @Given("Yo abro la pagina de valid")
     public void yo_abro_la_pagina_de_valid() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://valid.com/es/");
	 }

 
	@When("Estoy en el home")
     public void estoy_en_el_home(){
		Ensure.that(driver.getCurrentUrl().equals("https://valid.com/es/"));
     }

     @Then("Ingreso a la opcion de empleo")
     public void ingreso_a_la_opcion_de_empleo(){
    	 
    	 driver.findElement(By.id("menu-item-4521")).click();
     }
     
     public void cerrarDriver() {
        driver.quit();
        driver.close();
     }
     
}
