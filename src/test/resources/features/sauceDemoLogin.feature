Feature: SauceDemo login
  Background:
    Given Ingreso a web SauceDemo con navegador "Chrome"

    @Test
    Scenario: Login exitoso
      When Ingreso usuario correcto
      And Ingreso contraseña correcta
      And Presiono boton Login
      Then Visualizo pantalla "Products"

    @Test
    Scenario: Login sin contrasena
      When Ingreso usuario correcto
      And Presiono boton Login
      Then Visualizo cartel de error "Epic sadface: Password is required"