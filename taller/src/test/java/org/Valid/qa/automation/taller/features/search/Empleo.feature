Feature: Ingresar a la opcion empleo de valid
  
  Rule: Contar con la Url de valid

#Aqui, se escribe el feautre que seera implementado en los Steps, recuerde que, se debe de ejecutar esta clase para que genere los steps.
  Scenario: Abrir la pagina de valid e ingresar a la opccion de empleo
    Given Yo abro la pagina de valid
    When Estoy en el home
    Then Ingreso a la opcion de empleo
