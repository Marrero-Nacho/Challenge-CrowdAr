Feature: SauceDemo shopping cart

  Background:
    Given Ingreso a web SauceDemo con navegador "Chrome"
    And Realizo login exitoso

    @Test
    Scenario: Agregar un item al carro
      When Presiono boton Add to cart en algun producto
      Then El boton cambia de estado con texto "Remove"
      And El icono del carro en la esquina superior derecha posee un numero "2"

    @Test
    Scenario: Ingresar al carro de compras con elementos agregados
      And Presiono boton Add to cart en algun producto
      When Presiono boton Carro de compras
      Then Visualizo producto agregado en el carro de compras